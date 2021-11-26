package com.ReadExcelToMonth.V1.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WriteExcel implements AutoCloseable{
    private List<String> columnName;
    private String title = "";
    private String sheetName = "月份";
    private SXSSFWorkbook wb;
    private SXSSFSheet sheet;
    private CellStyle style;
    private Cell cell;
    private Row row;
    //抓取現在的格子位置
    private int rowNow = 0;
    private int placecount = 3;
    //放地點 PS 小心讀取的資料少一欄
    public String[] place = new String[]{"台北松山機場","","金門港","","桃園機場第一航廈","","桃園機場第二航廈","","高雄小港機場",""};
    //放閘數
    public String[] gate = new String[]{"2","2","3"," ","3","7","4","8","2","2"};
    //放tj 出入境
    public String[] in_out = new String[]{"入境","出境","出境"," ","入境","出境","入境","出境","入境","出境"};


    public WriteExcel(SXSSFWorkbook wb) {
        this.wb = wb;
    }

    public SXSSFWorkbook creatExcel(String[] list1,List<List<List<String>>> data) throws Exception{
        //1.创建一个workbook,对应一个Excel文件
        wb= new SXSSFWorkbook();
        //2.在workbook中添加一个sheet,对应Excel文件中的sheet
        sheet=wb.createSheet(sheetName);
        creatStyle();
        creatTitle("國人成功數量");
        //第三參數是現在 list1,List<List<List<String>>> data 要取哪格的資料
        writeData(list1,data,0);
        creatTitle("外人成功數量");
        writeData(list1,data,1);
        //原data資料中間有一筆資料是加總所以多+1
        creatTitle("國人失敗數量");
        writeData(list1,data,3);
        creatTitle("外人失敗數量");
        writeData(list1,data,4);
        return wb;
    }

    //取日期
    public List<String> getDate(String[] list1){
        List<String> date  = new ArrayList<>();
        for(int i = 0;i<list1.length;i++){
            String newdate = list1[i].substring(10,14);
            StringBuilder bf = new StringBuilder(newdate);
            bf.insert(2,"/");
            date.add(bf.toString());
        }
        return date;
    };


    public void creatTitle(String rowname){
        //3.在sheet中添加表头第0行

        rowNow += 1;
        row= sheet.createRow((int)rowNow);
        sheet.addMergedRegion(new CellRangeAddress(rowNow,rowNow,0,2));
        cell=row.createCell((short)0);
        cell.setCellValue(rowname);

        //地點等固定資料
        sheet.addMergedRegion(new CellRangeAddress(rowNow+2,rowNow+3,0,0));
        sheet.addMergedRegion(new CellRangeAddress(rowNow+4,rowNow+5,0,0));
        sheet.addMergedRegion(new CellRangeAddress(rowNow+6,rowNow+7,0,0));
        sheet.addMergedRegion(new CellRangeAddress(rowNow+8,rowNow+9,0,0));
        sheet.addMergedRegion(new CellRangeAddress(rowNow+10,rowNow+11,0,0));
        rowNow+=2;
        for(int i = 0;i<place.length;i++){
            row= sheet.createRow((int)i+rowNow);
            //從第三格開始,加入rowNow讓他判斷第二次呼叫此方法row位置
            if(rowNow+i == placecount){
                cell=row.createCell((short)0);
                cell.setCellValue(place[i]);
                placecount += 2;
            }

            cell=row.createCell((short)1);
            cell.setCellValue(gate[i]);
            cell=row.createCell((short)2);
            cell.setCellValue(in_out[i]);

        }

    }


    public  SXSSFWorkbook writeData(String[] list1,List<List<List<String>>> data,int dataplace){
        row= sheet.createRow(rowNow -1 );
        //4.2单元格信息设置
        cell=row.createCell((short)0);
        cell.setCellValue("地點");
        cell.setCellStyle(style);
        cell = row.createCell((short)1);
        cell.setCellValue("閘數");
        cell.setCellStyle(style);
        cell = row.createCell((short)2);
        cell.setCellValue("出入境");

        //格子寬度
        sheet.setColumnWidth(0, 5000);
        //放日期
        List<String> date = getDate(list1);
        for(int i =0;i<date.size();i++){
            cell=row.createCell((short)i+3);
            cell.setCellValue(date.get(i));
        }
//        data.stream().forEach(p-> System.out.println(p));
        //放資料
        int datarow = 0;
        int peopleSum = 0;
        for(int i =0;i<place.length;i++){
            row = sheet.getRow(i+rowNow);
            if(i != 3){
                for(int z =0;z<list1.length;z++){
                    cell=row.createCell((short)z+3);
                    cell.setCellValue(Float.valueOf(data.get(z).get(datarow).get(dataplace)));
                    peopleSum += Float.valueOf(data.get(z).get(datarow).get(dataplace));
                    }
                datarow++;
                }

        }

        rowNow += 11;
        placecount+=4;
        return wb;
    }


    public void creatStyle(){
        //4.创建单元格,并且设置表头,设置表头居中
        CellStyle style=wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("新細明體");

        //4.1格式居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //設置字體
        style.setFont(font);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        //設置邊框
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
    }

    @Override
    public void close() throws Exception {
        if (wb != null) {
            wb.close();
        }
    }
}

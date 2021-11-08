package com.ReadExcelToMonth.V1.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteExcel implements AutoCloseable{
    private List<String> columnName;
    private String title = "";
    private String sheetName = "月份";
    private SXSSFWorkbook wb;
    private SXSSFSheet sheet;




    public WriteExcel(SXSSFWorkbook wb) {
        this.wb = wb;
    }

    public SXSSFWorkbook creatExcel() throws Exception{

        sheet = wb.createSheet(sheetName);
        wb = writeData();
        return wb;
    }

    public static SXSSFWorkbook writeData(){
        //1.创建一个workbook,对应一个Excel文件
        SXSSFWorkbook wb= new SXSSFWorkbook();
        //2.在workbook中添加一个sheet,对应Excel文件中的sheet
        Sheet sheet=wb.createSheet("ONEID資料表");
        sheet.setColumnWidth(0, 3766);
        //3.在sheet中添加表头第0行
        Row row= sheet.createRow((int)2);
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



        //4.2单元格信息设置
        Cell cell=row.createCell((short)0);
        cell.setCellValue("日期");
        cell.setCellStyle(style);
        cell = row.createCell((short)1);
        cell.setCellValue("mrp");
        cell.setCellStyle(style);
        cell = row.createCell((short)2);

        return wb;
    }




    @Override
    public void close() throws Exception {
        if (wb != null) {
            wb.close();
        }
    }
}

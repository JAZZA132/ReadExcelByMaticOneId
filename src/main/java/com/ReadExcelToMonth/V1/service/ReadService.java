package com.ReadExcelToMonth.V1.service;

import com.ReadExcelToMonth.V1.bean.NativeInBean;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadService {
    //讀取Excel
    public Workbook getWorkbook(String path) {

        Workbook wb = null;
        if (path == null)
            return null;
        String extString = path.substring(path.lastIndexOf(".")+1);
        InputStream is;
        try {
            is = new FileInputStream(path);
            if ("xls".equals(extString)) {
                wb = new HSSFWorkbook(is);
            } else if ("xlsx".equals(extString)) {
                wb = new XSSFWorkbook(is);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    // 讀取要用的 Sheet
//    public Sheet getSheet(Workbook workbook, int sheetNo){
//        return workbook.getSheetAt(sheetNo);
//    }

    // 把所有欄位讀出成 List<List<String>>
    public List<List<String>> readFields(Workbook workbook, int sheetNo, int firstRow, int firstCol,int endcolnum) throws Exception {
        Sheet sheet = workbook.getSheetAt(sheetNo);
        Row row = sheet.getRow(0);
        int rownum = sheet.getPhysicalNumberOfRows();
        //抓到哪一列
//        int colnum = row.getPhysicalNumberOfCells();

        List<List<String>> list = new ArrayList<>();
        List<String> _inner;
        for(int i = firstRow; i < rownum; i++){


            row = sheet.getRow(i);

            _inner = new ArrayList<>();
            if(row != null){
                for(int j = firstCol; j < endcolnum; j++){
                    Cell cell = row.getCell(j);
                    cell.setCellType(CellType.STRING);
                    _inner.add(cell.getStringCellValue());
                }
                list.add(_inner);
            }else{
                break;
            }
        }
        return list;
    }

}

package com.ReadExcelToMonth.V1.service;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.util.List;

public class WriteExcel implements AutoCloseable{
    private List<String> columnName;
    private String title = "";
    private String sheetName = "月份";
    private SXSSFWorkbook wb;
    private SXSSFSheet sheet;

    public void CreatExcel(List<List<String>> w) throws Exception{

    }



    @Override
    public void close() throws Exception {
        if (wb != null) {
            wb.close();
        }
    }
}

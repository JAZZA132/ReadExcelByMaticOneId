package com.ReadExcelToMonth.V1.service;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class WriteExcel implements AutoCloseable{

    private String title = "";
    private String sheetName = "月份";
    private SXSSFWorkbook wb;
    private SXSSFSheet sheet;

    public WriteExcel(){

    }



    @Override
    public void close() throws Exception {
        if (wb != null) {
            wb.close();
        }
    }
}

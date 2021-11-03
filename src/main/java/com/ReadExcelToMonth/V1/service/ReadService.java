package com.ReadExcelToMonth.V1.service;

import com.ReadExcelToMonth.V1.bean.NativeInBean;
import com.ReadExcelToMonth.V1.bean.OtherThing;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReadService {
    public OtherThing o;

    //讀取Excel
    public Workbook getWorkbook(String path) {

        Workbook wb = null;
        if (path == null)
            return null;
        String extString = path.substring(path.lastIndexOf(".")+1);
        //想用這個取得天數,以後可能可以改放controller
        String date = path.substring(path.lastIndexOf("_")+1,path.lastIndexOf("v1"));
        o = new OtherThing();
        o.setDate(date);

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

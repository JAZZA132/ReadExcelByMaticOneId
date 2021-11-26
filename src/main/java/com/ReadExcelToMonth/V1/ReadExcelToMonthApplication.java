package com.ReadExcelToMonth.V1;

import com.ReadExcelToMonth.V1.bean.NativeBean;
import com.ReadExcelToMonth.V1.bean.OtherThing;
import com.ReadExcelToMonth.V1.service.ReadService;
import com.ReadExcelToMonth.V1.service.WriteExcel;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ReadExcelToMonthApplication {


//	public static void main(String[] args) {
//		SpringApplication.run(ReadExcelToMonthApplication.class, args);
//	}



	public static void main(String[] args) throws Exception {
		String path = "D:\\SideProject\\ReadExcelByMaticOneId";

		File folder1 = new File(path + "\\MonthExcel");
		String[] list1 = folder1.list(); //讀取資料夾所有檔案名稱
		ReadService a = new ReadService();
		Workbook wb = null;
		NativeBean nativeBean = new NativeBean();
		List<List<String>> tt = null;
		//存放資料
		List<List<List<String>>> listdata = new ArrayList();

		for (int i = 0; i < list1.length; i++) {
			wb =a.getWorkbook(path +"\\MonthExcel\\" + list1[i]);
			tt = a.readFields(wb,0,3,4,10);
			listdata.add(tt);
		}


//		wb =a.getWorkbook("D:\\sideproject\\ReadExcelToMonth\\MonthExcel\\通關統計表_20211001v1.xlsx");
//		allthiing.stream().forEach(p-> p.stream().forEach(x-> System.out.println(x)));

		SXSSFWorkbook ww = new SXSSFWorkbook((XSSFWorkbook) wb);
		WriteExcel writeExcel = new WriteExcel(ww);
		ww = writeExcel.creatExcel(list1,listdata);
		OutputStream f = new FileOutputStream(path + "\\123.xlsx");
		ww.write(f);
		ww.close();
	}
}

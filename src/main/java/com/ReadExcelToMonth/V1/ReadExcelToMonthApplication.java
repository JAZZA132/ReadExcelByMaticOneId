package com.ReadExcelToMonth.V1;

import com.ReadExcelToMonth.V1.service.ReadService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadExcelToMonthApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(ReadExcelToMonthApplication.class, args);
//	}

	public static void main(String[] args) throws Exception {
		ReadService a = new ReadService();
		Workbook wb = a.getWorkbook("D:\\sideproject\\ReadExcelToMonth\\MonthExcel\\通關統計表_20211001v1.xlsx");

		System.out.println(a.readFields(wb,0,2,4,10));
	}
}

package com.ReadExcelToMonth.V1;

import com.ReadExcelToMonth.V1.bean.OtherThing;
import com.ReadExcelToMonth.V1.service.ReadService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ReadExcelToMonthApplication {


//	public static void main(String[] args) {
//		SpringApplication.run(ReadExcelToMonthApplication.class, args);
//	}



	public static void main(String[] args) throws Exception {
		ReadService a = new ReadService();
		Workbook wb = a.getWorkbook("D:\\sideproject\\ReadExcelToMonth\\MonthExcel\\通關統計表_20211001v1.xlsx");
		List<List<String>> tt = a.readFields(wb,0,2,4,10);
		tt.stream().forEach(p-> System.out.println(p));
		tt.stream().forEach(p-> System.out.println(p.get(0)));
	}
}

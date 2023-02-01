package Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExtractingDataFromExcelByUsingDataProvider {
	@DataProvider(name = "Login")
	public static void excel(String sheetName,String UN, String PWD) throws IOException {
		File file=new File("./src/test/resources/testData/testdata (2).xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook Workbook = WorkbookFactory.create(fis);
		Sheet sheet = Workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
		
		
		
	}

}

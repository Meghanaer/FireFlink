package Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		excel("Login");
	}


	public static void excel(String sheetName) throws IOException {
		File file=new File("./src/test/resources/testData/testdata (2).xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet Login = workbook.getSheet(sheetName);
		int rowcount = Login.getPhysicalNumberOfRows();
		int colcount = Login.getRow(0).getPhysicalNumberOfCells();
		String s[][]=new String[rowcount][colcount];
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				s[i][j]=workbook.getSheet(sheetName).getRow(i).getCell(j).toString();
				System.out.println(s[i][j]);
			}
		}
	}
}


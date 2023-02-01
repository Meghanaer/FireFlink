package Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelStoreAndPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[][] arr= excel("Login");
		for(String[] s1:arr) {             //for(int i=0;i<rowcount;i++){
										  //for(int j=0;j<colcount;j++){
			for(String s2:s1) {
				System.out.print(s2+" ");
			}
			System.out.println();
		}
		

	}
	
	public static String[][] excel(String sheetName) throws IOException {
		File file=new File("./src/test/resources/testData/testdata (2).xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook Workbook = WorkbookFactory.create(fis);
		Sheet sheet = Workbook.getSheet(sheetName);
		int rowcount = sheet.getPhysicalNumberOfRows()-1;
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String s[][]=new String[rowcount][colcount];
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				s[i][j]=Workbook.getSheet(sheetName).getRow(i+1).getCell(j).toString();
			}
		}
		return s;
	}

}

package org.test.testscripts;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class JxlFileHandling {

	public static void main(String[] args) throws BiffException, IOException {
		
		// TODO Auto-generated method stub
File f = new File("../SeleniumAssignments/testdata.xls");
Workbook wb = Workbook.getWorkbook(f);
Sheet ws = wb.getSheet(0);
int rows = ws.getRows();
int columns = ws.getColumns();

for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
	
Cell c = ws.getCell(j,i);
System.out.println(c.getContents());
}

}

}
}
package org.test.testscripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*File f = new File("../SeleniumAssignments/Readfile.txt");
FileReader fr = new FileReader(f);
String s;
 int a ;
while ((a = fr.read())!=-1)
 {
	System.out.println((char)a); 
 }
 
 BufferedReader br = new BufferedReader(fr);
 
 while ((s=br.readLine())!=null)
		 {
	 System.out.println(s);
		 }
	}
*/
		FileReadWriteAssignment fwr = new FileReadWriteAssignment();
		//fwr.readRow(5);
		//fwr.readRowinRange(3,4);
	//fwr.writeData(2);
	fwr.writeDatainRange(2, 6);
	
	}	

}

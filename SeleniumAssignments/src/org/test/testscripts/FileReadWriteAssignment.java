package org.test.testscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteAssignment {
	
	
	
	
	
	public void readRow(int row) throws IOException
	{
		
		File f = new File("../SeleniumAssignments/Readfile.txt");
		FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		
		String s;
		for(int i=1;i<=row;i++)
		{
			s=br.readLine();
			if(i==row && s!=null)
			{
				System.out.println(s);
			}
		}
			
		
	}

	public void readRowinRange(int startrow, int endrow) throws IOException
	{
		File f = new File("../SeleniumAssignments/Readfile.txt");
		FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		int i=1;
		String s;
		while (i<startrow)
		{
			br.readLine();
			i++;
		}
		for(i=startrow;i<=endrow;i++)
		{
			s=br.readLine();
		System.out.println(s);	
		}
			
		
	}
	
	public void writeData(int rowcount) throws IOException
	{
		File f = new File("../SeleniumAssignments/writefile.txt");
		//FileReader fr = new FileReader(f);
		 //BufferedReader br = new BufferedReader(fr);
		 FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		 Scanner s = new Scanner(System.in);
		for (int i=1;i<=rowcount;i++)
		{
			System.out.println("Enter"+""+i+""+"input");
			String text= s.nextLine();
			System.out.println("String is "+text);
			
			bw.write(text);
			bw.newLine();
		
		}
		bw.close();
	}

	public void writeDatainRange(int srowcount, int erowcount) throws IOException
	{
		File f = new File("../SeleniumAssignments/writefile2.txt");
		//FileReader fr = new FileReader(f);
		//BufferedReader br = new BufferedReader(fr);
		 FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		 Scanner s = new Scanner(System.in);
		int j=1;
	
		 
		 for (int i=1;i<=erowcount;i++)
		{
			 if(i<srowcount)
			 {
				 bw.newLine();
			 }
			 else {
			System.out.println("Enter"+""+i+""+"input");
			String text= s.nextLine();
			System.out.println("String is "+text);
			
			bw.write(text);
			bw.newLine();
			 }
		}
		bw.close();
	}











}

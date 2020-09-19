package com.aish.assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Whitespace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader reader1 = new BufferedReader(new FileReader("D:/File1.txt"));
		
		BufferedReader reader2 = new BufferedReader(new FileReader("D:/File 2.txt"));
		
		String line1 = reader1.readLine();
		System.out.println(line1);
		line1 = line1.replaceAll("\\s","");
		String line2 = reader2.readLine();
		System.out.println(line2);
		line2 = line2.replaceAll("\\s","");
		System.out.println(line1);
		
		System.out.println(line2);
		boolean areEqual = true;
		
		int lineNum = 1;
		
		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;
				
				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;
				
				break;
			}
			
			line1 = reader1.readLine();
			
			line2 = reader2.readLine();
			
		}
		
		if(areEqual)
		{
			System.out.println("Two files have same content.");
		}
		else
		{
			System.out.println("Two files have different content. They differ at line "+lineNum);
			
			System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		
		reader1.close();
		
		reader2.close();	
	}

}


package com.aish.assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class CompareTextFile
{   
    public static void main(String[] args) throws IOException
    {   
        BufferedReader reader1 = new BufferedReader(new FileReader("D:/File1.txt"));
         
        BufferedReader reader2 = new BufferedReader(new FileReader("D:/File2.txt"));
         
        String line1 = reader1.readLine();
         
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
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
            System.out.println("Two files have different content.");
             
           
        }
         
        reader1.close();
         
        reader2.close();
    }
}

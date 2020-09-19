package com.aish.assignment1;
import java.util.Scanner;
public class Compare 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else {
        	System.out.println("The given Number "+n+" is not Negative");
        }
        s.close();
    }
}

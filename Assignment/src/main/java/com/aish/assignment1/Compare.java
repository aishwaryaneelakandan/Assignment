package com.aish.assignment1;
public class Compare 
{
    public boolean negative(int a) {
    	if(a<0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    	
    public boolean equal(int a,int b) {
	    if(a==b){
	    	return true;
	      }
	    else{
	    	return false;
	    }
	}
    public boolean isequal(String str1,String str2){
    	if(str1==str2) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean equals(String str1,String str2){
    	boolean bool=str1.equalsIgnoreCase(str2);
    	if(bool) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    public boolean even(int num) {
    	if(num%2==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean odd(int num) {
    	if(num%2!=0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean palindrome(String str) {
    	String rev="";
    	int length = str.length();
    	 
        for ( int i = length - 1; i >= 0; i-- )
           rev = rev + str.charAt(i);
   
        if (str.equals(rev)) {
        	return true;
        }
        else {
        	return false;
        }
    }
    public boolean isStringOnlyAlphabet(String str) {
    	return ((!str.equals("")) 
                && (str != null) 
                && (str.matches("^[a-zA-Z]*$")));
    }
    public String stringTimes(String str, int n) {
    	String abc="";
    	for (int i=0;i<n; i++){
    	abc=abc+str;
    	}
    	return abc;
    	}
    public String frontTimes(String str, int n) {
    	String def="";
    	for(int m=0;m<n;m++){
    	if(str.length()>=3)
    		def=str;
    	if(str.length()>3)
    		def=str.substring(0,3);
    	}
    	return def;
    	}
 }





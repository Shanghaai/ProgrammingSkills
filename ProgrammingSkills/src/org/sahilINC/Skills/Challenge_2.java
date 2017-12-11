package org.sahilINC.Skills;

import java.util.regex.*;
import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args) 
    {
    	//using regex API to implement patter match
    	String[] str =  new String[4];
    	System.out.println("Enter your 4 User Name ?");
    	Scanner sc =  new Scanner(System.in);
    	String pattern =  "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";
    	for (int i = 0; i < 4; i++) 
    	{
    		str[i] = sc.nextLine();
    	}
    	System.out.println("-----------------");
    	for (int j = 0; j < str.length; j++) {
    		if(str[j].matches(pattern))
    		{
    			System.out.println("PASS");
    		}
    		else
    		{
    			System.out.println("FAIL");
    		}
    	}
    }
}
    
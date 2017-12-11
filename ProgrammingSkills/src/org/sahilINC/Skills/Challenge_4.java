package org.sahilINC.Skills;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Challenge_4 
{
	public static void main(String[] args) {

		 int countAscii1=0;
		 int countAscii2=0;
		 
		System.out.println("Enter the String separated by ','?");
		Scanner sc =  new Scanner(System.in);
		
		String str = sc.nextLine();
		String splitstr[] = str.split(",");
		
		for (int i = 0; i < splitstr.length; i++) 
		{
			 String S =  splitstr[i];
			 char charArray[] = S.toCharArray();
			 
			 for (int j = 0; j < charArray.length; j++) 
			 {
				 int ascii = (int)charArray[j];
				 countAscii1 = countAscii1 + ascii;
			 }
		}
		
		System.out.println("ascii 1 : "+countAscii1);
		
	}
}

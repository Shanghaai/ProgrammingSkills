package org.sahilINC.Skills;

import java.io.*;
import java.util.*;
public class Main 
{
 public static void main(String[] args) 
 {
  String Data[] = new String[10];
  int splitData[][] = new int[10][2];

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 10 records...");
  for (int i = 0; i < 10; i++) 
  {
   Data[i] = sc.next();
   String str[] = Data[i].split("-");

   //Copy given data into two-D array

   splitData[i][0] = Integer.parseInt(str[1]); //score
   splitData[i][1] = Integer.parseInt(str[0]);//rollnumbebr
  }

  Arrays.sort(splitData, new Comparator < int[] > () 
		  {
	  		public int compare(int[] o1, int[] o2) // Sorting of array
	  		{
	  			return o2[0] - o1[0];
	  		}
		  });

  Byte flag = 0;
  System.out.println("Output Result");
  for (int i = 0; i < 10; i++) 
  {
	  flag = 0;

     for (int j = i - 1; j >= 0; j--) //Logic to check duplicate roll no
     {
	   if (splitData[i][1] == splitData[j][1]) // here they are checking next rollnumber to previous rollnumber
	   {
		   flag = 1;
		   break;
	   }
     }// for loop will gets break here if compiler put flag=1; n then back to main for loop
   
    if (flag == 0) 
   		{
	   	  System.out.println(splitData[i][1] + "-" + splitData[i][0]);
   		}
  }
 }
}

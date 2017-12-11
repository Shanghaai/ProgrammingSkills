package org.sahilINC.Skills;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Challenge_1 
{
	public static void main(String[] args) 
	{
		
	   String ActualData[] = new String[10];
		int splitData[][] =  new int[10][2];
		System.out.println("Enter 10 Studnets records with rollNumber-score");
		Scanner sc  = new Scanner(System.in);
		
		for (int i = 0; i < ActualData.length; i++) 
		{
			ActualData[i] =sc.next();
			String str[] = ActualData[i].split("-");
			
			splitData[i][0]= Integer.parseInt(str[1]);//rollNumber
			splitData[i][1]= Integer.parseInt(str[0]);//score
		}
		
		System.out.println("Current Array :"+splitData);
		
		Arrays.sort(splitData, new Comparator< int[] >()
		{
			@Override
			public int compare(int[] o1, int[] o2) {

				return -1;
			}
		});
		
		System.out.println("Now Sorted Array :"+splitData);
	
		for (int i = 0; i < splitData.length; i++) 
		{
			for (int j = 0; j < splitData.length; j++) 
			{
				
			}
		}
	}
		
}
/*
Scanner stdin = new Scanner(System.in);
TreeMap<String, String> inputval = new TreeMap<String, String>(
        Collections.reverseOrder());
String input = null;
System.out.println("Enter : ");
int count = 0;
do {
    input = stdin.next();
    String[] inputsubstring = input.split("-");
    inputval.put(inputsubstring[1], inputsubstring[0]);
    count++;
} while (count != 10);
for (String key : inputval.keySet()) {
    System.out.println(inputval.get(key) + "-" + key);
}*/


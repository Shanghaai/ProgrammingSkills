package org.sahilINC.Skills;

public class SplitFuction 
{

	public static void main(String[] args) {
		
		String Dbconetxt = "DBT1.T1PL0103";
		
		String[] context = Dbconetxt.split("\\.");
		
		String database = context[1];
		System.out.println(database);
		
		
	}
}

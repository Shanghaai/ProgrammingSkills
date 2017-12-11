package org.sahilINC.Skills;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Client
{
	
	public static void main(String[] args) 
	{
		
		Students arun  = new Students(1001,40);
		Students prakash  = new Students(1002,50);
		Students Jhon  = new Students(1003,60);
		Students selly  = new Students(1002,80);
		Students pankaj  = new Students(1005,35);
		Students dubey  = new Students(1005,55);
		Students vivek  = new Students(1007,68);
		Students sam  = new Students(1009,99);
		Students Bill  = new Students(1009,10);
		Students Mark  = new Students(1004,89);
		
		TreeSet tree  = new TreeSet();
		tree.add(vivek);
		tree.add(dubey);
		tree.add(selly);
		tree.add(Mark);
		tree.add(Bill);
		tree.add(sam);
		tree.add(arun);
		tree.add(pankaj);
		tree.add(selly);
		tree.add(Jhon);
		
		Iterator itr = tree.iterator();
		while(itr.hasNext())
		{
			Students st = (Students)itr.next();
			System.out.println("Student Score  : "+st.score);
		}
			
		System.out.println("====================================");
		
		
	}
	
}
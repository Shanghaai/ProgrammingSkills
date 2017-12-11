package org.sahilINC.Skills;

import java.util.Comparator;
import java.util.List;

public class Students implements Comparable<Students>
{
	int rollNumber;
	int score;

	public Students(int rollNumber, int score) 
	{
		this.rollNumber = rollNumber;
		this.score = score;
	}

	public int compareTo(Students o) 
	{
		if(this.score<o.score)
		{
			return +1;
		}
		if(this.score>o.score)
		{
			return -1;
		}
		return 0;
	}
	
}

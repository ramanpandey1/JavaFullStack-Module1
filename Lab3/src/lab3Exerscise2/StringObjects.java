package lab3Exerscise2;

import java.util.Arrays;

public class StringObjects {
	public String[] calculate(String string[])
	{
		int index;
		for(index=0;index<string.length;index++)
		{
			string[index]=string[index].toLowerCase();
		}
		Arrays.sort(string);
		if(string.length%2==0)
		{
			for(index=0;index<string.length/2;index++)
			{
				string[index]=string[index].toUpperCase();
			}
			for(index=string.length/2;index<string.length;index++)
			{
				string[index]=string[index].toLowerCase();
			}
		}
		else
		{
			for(index=0;index<=string.length/2;index++)
			{
				string[index]=string[index].toUpperCase();
			}
			for(index=string.length+1;index<string.length;index++)
			{
				string[index]=string[index].toLowerCase();
			}
		}
		return string;
	}
}

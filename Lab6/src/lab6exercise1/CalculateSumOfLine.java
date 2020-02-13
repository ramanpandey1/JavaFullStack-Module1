package lab6exercise1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculateSumOfLine {

	public void calculate()
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer sb=new StringTokenizer(str," ");
		ArrayList<Integer> al=new ArrayList<>();
		int sum=0;
		while(sb.hasMoreTokens())
		{
			al.add(Integer.parseInt(sb.nextToken()));
		}
		for (int i:al)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
}

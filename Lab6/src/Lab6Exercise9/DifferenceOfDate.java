package Lab6Exercise9;

import java.util.Date;

public class DifferenceOfDate {

	public void printDifferenceOfDates(Date date)
	{
		Date currentdate=new Date();
		System.out.println("Duration in Days:"+Math.abs(currentdate.getDate()-date.getDate()));
		System.out.println("Duration in months:"+Math.abs(currentdate.getMonth()-date.getMonth()));
		System.out.println("Duration in years:"+Math.abs(currentdate.getYear()-date.getYear()));
	}
}

package com.cg.lab8.exercise2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateTimer implements Runnable {
	
	public void calculate()
	{
		Thread t=new Thread(this,"TimerClassThread");
		t.start();
	}
	
	
	public void run()
	{
		
		SimpleDateFormat sm=new SimpleDateFormat("hh:mm:ss");
		while(true)
		{
			Calendar c= Calendar.getInstance();
			System.out.println(sm.format(c.getTime()));
			try
			{
			   Thread.sleep(1000*10);
		    }
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
	}

}
}

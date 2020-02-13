package com.cg.lab8.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingDataFromFile extends Thread {

	File source,target;
	
	public CopyingDataFromFile(File sourceFile, File targetFile) {
		// TODO Auto-generated constructor stub
		this.source=sourceFile;
		this.target=targetFile;
		
	}

	public void run()
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(target,true);
			FileInputStream fis =new FileInputStream(source);
			while(true)
			{
				byte b1[]=new byte[10];
				fis.read(b1);
				System.out.println("10 character read");
				Thread.sleep(5000);
				fos.write(b1);
				int b;
				if((b=fis.read())==-1)
				{
					System.out.println("File Ended");
					break;
				}
				else
					fos.write(b1);
			}
		}
		catch(FileNotFoundException e)
		{
		
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package com.cg.lab8.exercise1;

import java.io.File;
import java.util.Scanner;

public class CopyingDataFromFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter source file");
		String source=sc.nextLine();
		System.out.println("Enter target file");
		String target=sc.nextLine();
		File sourceFile=new File(source);
		File targetFile=new File(target);
		if(sourceFile.exists() && targetFile.exists())
		{
			CopyingDataFromFile obj=new CopyingDataFromFile(sourceFile,targetFile);
			obj.start();
		}
		 else if(!sourceFile.exists())
	    	 System.out.println("Source file does not exits");
	     else if(!targetFile.exists())
	    	 System.out.println("Target file does not exits !!");
	    
		sc.close();
		

	}

}

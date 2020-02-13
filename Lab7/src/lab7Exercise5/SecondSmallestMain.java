package lab7Exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestMain {
	
	public static void main(String[] args) {
		SecondSmallest object=new SecondSmallest();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=scanObj.nextInt();
		int[] inputArray=new int[size];
		for(int index=0;index<size;index++) {
		System.out.println("Enter element:");	
		inputArray[index]=scanObj.nextInt();
		}
		scanObj.close();
		
		System.out.println(object.getSecondSmallest(inputArray));
	
	}
}



package lab7Exercise3;

import java.util.Scanner;

public class SquaresAndHashMapsMain {

	public static void main(String[] args) {
	SquaresAndHashMaps object=new SquaresAndHashMaps();
	Scanner scanObj=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size=scanObj.nextInt();
	int[] inputArray=new int[size];
	for(int index=0;index<size;index++) {
		System.out.println("Enter element:");
		inputArray[index]=scanObj.nextInt();
	}
	scanObj.close();
	
	System.out.println(object.getSquares(inputArray));

	}

}

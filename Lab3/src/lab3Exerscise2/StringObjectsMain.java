package lab3Exerscise2;

import java.util.Scanner;

public class StringObjectsMain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		StringObjects obj=new StringObjects();
		System.out.println("Enter size of array");
		int size=ob.nextInt();
		String stringInput[]=new String[size];
		String stringOutput[]=new String[size];
		System.out.println("Enter elements in array");
		for(int index=0;index<=size;index++)
		{
			stringInput[index]=ob.nextLine();
		}
		stringOutput=obj.calculate(stringInput);
		for(int index=0;index<size;index++)
		{
			System.out.println(stringOutput[index]);
		}
		ob.close();

	}

}

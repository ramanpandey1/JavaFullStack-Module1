package lab6exercise5;

import java.util.Scanner;

public class ChangeNumberAccordingToDifferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		String input=sc.nextLine();
		DifferenceOfNumber obj=new DifferenceOfNumber();
		obj.modifyNumber(input);
		
	}

}

package lab6Exercise8;

import java.util.Scanner;

public class CheckPositiveStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		CheckPositiveString obj=new CheckPositiveString();
		boolean ispositive=obj.isPositive(s1);
		if(ispositive)
			System.out.println("String is positive !!");
		else
			System.out.println("String is Negative!!");
		scan.close();
	}

}

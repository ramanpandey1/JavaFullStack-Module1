package lab1Exerscise4;

import java.util.Scanner;

public class PowerOfTwoMain {

	public static void main(String[] args) {
	PowerOfTwo object=new PowerOfTwo();
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter the number:");
	int inputNumber=scanObj.nextInt();
	System.out.println(object.chechNumber(inputNumber));
	scanObj.close();
	}

}

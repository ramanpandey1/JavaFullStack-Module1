package Lab6Exercise4;

import java.util.Scanner;

public class LeaveVowelMain {

	public static void main(String[] args) {
		LeaveVowel classObject=new LeaveVowel();
		Scanner scanObj=new Scanner(System.in);
		String inputString=scanObj.next();
		System.out.println(classObject.nextConsonant(inputString));
	}

}

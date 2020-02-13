package Lab6Exercise3;

import java.util.Scanner;

public class MirrorStringMain {

	public static void main(String[] args) {
	MirrorString classObject=new MirrorString();
	Scanner scanObject=new Scanner(System.in);
	System.out.println("Enter the string:");
	String inputString=scanObject.next();
	classObject.printMirror(inputString);
	}
}

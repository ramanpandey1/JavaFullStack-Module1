package lab7Exercise6;

import java.util.HashMap;
import java.util.Scanner;

public class VotingEligibilityMain {

	public static void main(String[] args) {
	VotingEligibility object=new VotingEligibility();
	Scanner scanObj=new Scanner(System.in);
	
	HashMap<Integer,Integer> hashObj=new HashMap<Integer,Integer>();
	
	System.out.println("Any number to enter, 0 to exit");
	int criteria=scanObj.nextInt();
	while(criteria!=0) {
		System.out.println("enter reg");
		int regNo=scanObj.nextInt();
		System.out.println("Enter age");
		int age=scanObj.nextInt();
		hashObj.put(regNo, age);
		System.out.println("any number to add more, 0 to exit.");
		criteria=scanObj.nextInt();
	}
	scanObj.close();
	
	System.out.println(object.votersList(hashObj));
	}

}

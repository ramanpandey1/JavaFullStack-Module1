package lab7Exercise8;

import java.util.Arrays;

public class RemoveDuplicatesMain {

	public static void main(String[] args) {
	RemoveDuplicates object=new RemoveDuplicates();
	int inputArray[]= {12,12,12,12,12,23,34,45,56,678};

	System.out.println(Arrays.toString(object.modifyArray(inputArray)));
	}
}

package lab7Exercise8;

import java.util.TreeSet;

public class RemoveDuplicates {
public int[] modifyArray(int[] array){
	TreeSet<Integer> obj=new TreeSet<Integer>();
	for(int index:array) {
		obj.add(index);
	}
	
	obj=(TreeSet<Integer>) obj.descendingSet();
	
	int[] newArray=new int[obj.size()];
	int i=0;
	for(int index:obj) {
		newArray[i]=index;
		i++;
	}
	
	return newArray;
}
}

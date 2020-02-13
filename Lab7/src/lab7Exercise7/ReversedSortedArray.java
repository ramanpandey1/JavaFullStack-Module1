package lab7Exercise7;

import java.util.ArrayList;
import java.util.Collections;

public class ReversedSortedArray {
public int[] getSorted(int[] array) {
	ArrayList<Integer> obj=new ArrayList<Integer>();
	int digit, i=0;
	for(int index:array) {
		int reverse=0;
		while(index>0) {
			digit=index%10;
			reverse=reverse*10+digit;
			index=index/10;
		}
		obj.add(reverse);
	}
	
	Collections.sort(obj);
	
	for(Integer index:obj) {
		array[i]=index;
		i++;
	}
	
	return array;
}
}

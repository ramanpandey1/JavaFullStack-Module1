package lab7Exercise1;

import java.util.HashMap;

public class HashMapToSortedListMain {

public static void main(String[] args) {
		HashMapToSortedList object=new HashMapToSortedList();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(123,2);
		hm.put(1223, 67);
		hm.put(234,1);
		System.out.println(object.sort(hm));;
	}
}

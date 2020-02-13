package lab7Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HashMapToSortedList {
public ArrayList<Integer> sort(HashMap<Integer,Integer> map){
	ArrayList<Integer> obj =new ArrayList<Integer>(map.values());
	Collections.sort(obj);
	return obj;
}
}


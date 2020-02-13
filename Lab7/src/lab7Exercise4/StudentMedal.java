package lab7Exercise4;

import java.util.HashMap;

public class StudentMedal {
public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> map){
	HashMap<Integer,String> mapObj=new HashMap<Integer,String>();
	
	for(Integer index:map.keySet()) { 
		if(map.get(index)>60) {
			mapObj.put(index,"Gold");
		}
		}
	return mapObj;
}
}

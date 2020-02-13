package lab7Exercise4;

import java.util.HashMap;

public class StudentMedalMain {

	public static void main(String[] args) {
	StudentMedal object=new StudentMedal();
	HashMap<Integer,Integer> mapInput= new HashMap<Integer,Integer>();
	mapInput.put(11603003, 80);
	mapInput.put(11603001, 90);
	System.out.println(mapInput);
	System.out.println(object.getStudents(mapInput));
	}
}

package lab7Exercise6;

import java.util.ArrayList;
import java.util.HashMap;
public class VotingEligibility {
	public ArrayList<Integer> votersList(HashMap<Integer,Integer> map){
		ArrayList<Integer> obj=new ArrayList<Integer>();
		for(Integer index:map.keySet()) {
			if(map.get(index)>18) {
				obj.add(index);
			}
			}
		return obj;
	}
}

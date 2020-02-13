package lab7Exercise3;

import java.util.HashMap;

public class SquaresAndHashMaps {
public HashMap<Integer,Integer> getSquares(int[] array){
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i:array) {
		int square=i*i;
		map.put(i,square);
	}
	return map;
}
}

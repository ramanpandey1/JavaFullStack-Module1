package lab7Exercise5;

import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallest {
		public int getSecondSmallest(int[] array) {
			ArrayList<Integer> obj=new ArrayList<Integer>();
			for(int index:array ) {
				obj.add(index);
			}
			Collections.sort(obj);
			
			return obj.get(1);
		}
}


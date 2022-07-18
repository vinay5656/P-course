package listExercise;

import java.util.ArrayList;
import java.util.Iterator;

public class ListQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Wipro");
		list.add("TCS");
		list.add("Google");
		list.add("Meta");
		list.add("Microsoft");
		
		Iterator<String> itr = list.iterator();
		int count =0 ;
		
		while(itr.hasNext()) {
			System.out.println(count+": "+itr.next());
			count++;
		}
		

	}

}

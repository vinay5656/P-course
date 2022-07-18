package setExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TreeSet deceleration 
		TreeSet<String> set = new TreeSet<String>();
		
		// Element added to set
		set.add("Wipro");
		set.add("TCS");
		set.add("Google");
		set.add("Meta");
		set.add("Microsoft");
		
		// b. Iterate the elements of the TreeSet using Iterator and observe the order
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		
		//a. Reverse the element 
		Iterator<String> itr1 = set.iterator();
		ArrayList<String> helper = new ArrayList<String>();

		System.out.println();
		while(itr1.hasNext()) {
			helper.add(itr1.next());	
		}

		int index =helper.size()-1;
		
		Set<String> set1 = new LinkedHashSet<String>();
		while(!helper.isEmpty()) {
			set1.add(helper.remove(index));
			index--;
		}
		System.out.print("Reversed :");
		for(String str : set1) {
			System.out.print(str+" ");
		}
		 System.out.println();
		/////////////Check if a particular element exists or not//////////////////
		System.out.println(set.contains("Wipro"));
		System.out.println(set.contains("Infosys"));

	}

}

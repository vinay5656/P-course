package listExercise;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(23);
		vec.add(24);
		vec.add(25);
		vec.add(26);
		vec.add(27);
		vec.add(28);
		vec.add(29);
		vec.add(30);
		
		System.out.println("Iterator for loop...........");
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Standard for loop.........");
		
		for(Integer num : vec) {
			System.out.println(num);
		} 
		System.out.println("listIterator...........");
		ListIterator<Integer> listIterator
        = vec.listIterator();
	    while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }

	}

}

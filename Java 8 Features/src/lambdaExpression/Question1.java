package lambdaExpression;

import java.util.ArrayList;

/**
 * Create an ArrayList al and add 25 random numbers. Write a code to print all
 * prime numbers that are present in it, using lambda expression.
 */

interface PrintArrayList {
	void print(ArrayList<Integer> al);
}

class ArrayListPrintClass implements PrintArrayList {

	@Override
	public void print(ArrayList<Integer> al) {
		for (Integer num : al) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			al.add((int) (Math.round(Math.random() * 100) + 1));
		}
//		Method 1:- print it directly
//		for(Integer num: al) {
//			System.out.println(num);
//		}

		/**
		 * Method 2: - Use class that's implement the interface Then create the object
		 * of class Using object call the print method
		 */
		System.out.println("Print using class object...........");
		ArrayListPrintClass classObj = new ArrayListPrintClass();
		classObj.print(al);

		/**
		 * Method 3:- Using Anonymous class:- When a object of class won't required in
		 * future then instead of creating object of class. We use anonymous class
		 */
		System.out.println("Printing using anonymous object.......");
		PrintArrayList interfaceObj = new PrintArrayList() {
			public void print(ArrayList<Integer> al) {
				for (Integer num : al) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		};

		interfaceObj.print(al);

		// I can create anonymous class object also
		System.out.println("----------Anonymous class object-----------");
		ArrayListPrintClass classAnonymousObj = new ArrayListPrintClass() {
			public void print(ArrayList<Integer> al) {
				for (Integer num : al) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		};
		classAnonymousObj.print(al);

		/*
		 * * Method 4:- Create a lambda expression then call the interface method.
		 */
		System.out.println("Printing Using lambda expression........");
		PrintArrayList printObj = (list) -> {
			for (Integer num : list) {
				System.out.print(num+" ");
			}
			System.out.println();
		};

		printObj.print(al);
		
		/**Wipro Exercise Part....*/
		System.out.println(".....Wipro Exercise part.....");
		PrintArrayList printObjWipro = (list) -> {
			for (Integer num : list) {
				boolean isPrime = true;
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime==true) {
					System.out.print(num+" ");
				}
			}
			System.out.println();
			
		};
		
		printObjWipro.print(al);
		

	}

}

package lambdaExpression;

import java.util.ArrayList;

interface PrintStrings{
	void printInReverseOrder(ArrayList<String> words);
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		words.add("Vinay");words.add("Ravi");
		words.add("Bhavesh");
		words.add("Loki");
		words.add("Shray");
		words.add("Ujjwal");
		words.add("Perteek");words.add("Ram");
		words.add("Singh");words.add("Chouhan");
		
		PrintStrings obj = (list)->{
			int lastIndex = list.size()-1;
			System.out.println("lastIndex: ="+lastIndex);
			for (int i=lastIndex;i>=0;i--) {
				System.out.print(list.get(i)+ " ");
			}
			System.out.println();
		};
		
		obj.printInReverseOrder(words);

	}

}

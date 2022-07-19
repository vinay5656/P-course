package lambdaExpression;

import java.util.ArrayList;

interface PrintOddLenth{
	void printOddStrings(ArrayList<String> words);
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		words.add("Vinay");words.add("Ravi");
		words.add("Bhavesh");
		words.add("Loki");
		words.add("Shray");
		words.add("Ujjwal");
		words.add("Perteek");words.add("Ram");
		words.add("Sanjay");words.add("Chouhan");
		
		PrintOddLenth obj = (list) ->{
			for(String word : list) {
				int lengthOfWord = word.length();
				if(lengthOfWord%2!=0) {
					System.out.print(word+" ");
				}	
			}
			System.out.println();	
		};
		obj.printOddStrings(words);

	}

}

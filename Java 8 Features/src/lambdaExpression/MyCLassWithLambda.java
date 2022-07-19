package lambdaExpression;

import java.util.Scanner;

interface WordCount{
	int count(String str);
}

public class MyCLassWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sentance = sc.nextLine();
		
		WordCount obj = (str) -> {
			String [] strings = str.split(" ");
			return strings.length;
		};
		
		System.out.println(obj.count(sentance));
		sc.close();

	}

}

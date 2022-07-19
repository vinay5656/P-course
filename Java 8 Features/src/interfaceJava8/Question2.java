package interfaceJava8;



import java.util.Scanner;

interface Test{
	int myFunction(int a, int b, int c);
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
	
		
		Test t1 = (a,b,c)->a+b+c;
		Test t2 = (a,b,c)->a*b*c;
		
		
		
		int resultOfAddition = t1.myFunction(firstNumber, secondNumber, thirdNumber);
		int resultOfMultiplication = t2.myFunction(firstNumber, secondNumber, thirdNumber);
		
		System.out.println(resultOfAddition);
		System.out.println(resultOfMultiplication);
		sc.close();
	}
}

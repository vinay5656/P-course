package methodReference;

interface ReferInterface{
	int get(int n);
}

class Factorial{
	int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return factorial(n-1)*n;
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorialObj = new Factorial();
		
		ReferInterface referToObj = factorialObj::factorial;
		
		System.out.println(referToObj.get(5));

	}

}

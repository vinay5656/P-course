package methodReference;

interface ConstructorReference{
	void referConstructor(int n);
}

class ThisClass{
	ThisClass(int n) {
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorReference reference = ThisClass :: new;
		reference.referConstructor(455);
	
	}

}

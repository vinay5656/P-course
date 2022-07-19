package methodReference;

interface ReferenceInterface{
	int showNumberOfDigits(int n);
}

class Myclass{
	public static int digitCount(int n) {
		String str = Integer.toString(n);
		int numberDigit = str.length();
		return numberDigit;
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceInterface reference = Myclass::digitCount;
		
		System.out.println(reference.showNumberOfDigits(462374));
	}

}

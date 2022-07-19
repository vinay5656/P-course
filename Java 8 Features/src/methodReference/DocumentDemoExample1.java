package methodReference;

interface MyReference{
	void showMessage();
}

class MethodReferenceDemo{
	public void myInstanceMethod() {
		System.out.println("Example for Instance Methods Reference");
	}
}

public class DocumentDemoExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceDemo obj = new MethodReferenceDemo();
		
		MyReference reference = obj::myInstanceMethod;
		
		reference.showMessage();

	}

}

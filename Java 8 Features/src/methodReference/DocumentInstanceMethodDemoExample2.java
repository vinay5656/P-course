package methodReference;

interface MyReference2{
	int max(int a, int b);
}

class MethodReferenceDemo2{
	public int findMax(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
}


public class DocumentInstanceMethodDemoExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceDemo2 obj = new MethodReferenceDemo2();
		
		MyReference2 reference = obj::findMax;
		
		
		System.out.println(reference.max(56,23));

	}
	

}

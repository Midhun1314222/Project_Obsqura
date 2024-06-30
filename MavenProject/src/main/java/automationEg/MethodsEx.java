package automationEg;

public class MethodsEx {
	static int a=10;
	static int b=20;
	public static void addition() {
		int c=a+b;
		System.out.println(c);
	}
	public void multiplication(int d,int e) {
		int f=d*e;
		System.out.println(f);
	}
	public void addition1(int g,float h) {
		float i=g+h;
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsEx.addition();
		MethodsEx obj1=new MethodsEx();
		MethodsEx obj2=new MethodsEx();

		obj1.multiplication(3, 8);
		obj2.addition1(10,3.6f);
		

	}

}

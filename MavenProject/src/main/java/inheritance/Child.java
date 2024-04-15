package inheritance;

public class Child extends Parent{
	
	public void sub() {
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String []args) {
		Child d= new Child();
		d.sub();
		d.add();
		System.out.println(d.a);
		System.out.println(d.b);
	}

}

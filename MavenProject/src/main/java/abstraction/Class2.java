package abstraction;

public class Class2 extends Class1{
	
	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 obj=new Class2();
		obj.display();
		obj.display1();
		Class1.display2();

	}

}

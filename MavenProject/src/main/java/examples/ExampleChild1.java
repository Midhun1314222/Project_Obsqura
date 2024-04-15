package examples;

public class ExampleChild1 extends ExampleParent{
	public void sub() {
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleChild1 d=new ExampleChild1();
		d.add();
		d.sub();
	}

}

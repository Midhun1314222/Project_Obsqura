package examples;

public class ExampleChild extends ExampleParent {
	public void multi() {
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ExampleChild e=new ExampleChild();
		e.multi();
		e.add();
	}

}

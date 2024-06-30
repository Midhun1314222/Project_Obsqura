package inheritanceReview;

public class ExampleChild extends ExampleParent {
	public void sub() {
		int d=a-b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		ExampleChild obj=new ExampleChild();
		obj.addition();
		obj.sub();
	}

}

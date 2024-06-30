package finalKeyword;

public class FinalExample1 extends FinalExample {
	/*public final void display() {
		System.out.println("Final");
	}*/ //cant override final method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalExample1 obj=new FinalExample1();
obj.display();
System.out.println(obj.a);
	}

}

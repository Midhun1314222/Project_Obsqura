package polymorphism;

public class ChildClass extends ParentClass {
	public void add() {
		super.add();
		int a=10,b=20;
		int c=b-a;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.add();
		
	}

}

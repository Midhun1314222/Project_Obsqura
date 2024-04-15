package inheritance;

public class ChildClass extends ChildClass1 {
	int e;
	public void div() {
		int e=a/b;
		System.out.println(e);
	}
	public static void main(String[] args) {
ChildClass g=new ChildClass();
g.add();
g.sub();
g.div();
	}

}

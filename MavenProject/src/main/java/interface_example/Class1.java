package interface_example;

public class Class1 implements InterfaceEx,InterfaceEx1 {
	public void display() {
		System.out.println("Numbers are: "+a+","+b);
	}
	public void print() {
		System.out.println("This is interface program");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class1 obj = new Class1();
obj.display();
obj.print();
	}

}

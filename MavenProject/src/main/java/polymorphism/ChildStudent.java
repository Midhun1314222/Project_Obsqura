package polymorphism;

public class ChildStudent extends ParentStudent{
	String address="Kottayam";
	
	public void display() {
		super.display();
		System.out.println("Student Address: "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildStudent obj=new ChildStudent();
obj.display();
	}

}

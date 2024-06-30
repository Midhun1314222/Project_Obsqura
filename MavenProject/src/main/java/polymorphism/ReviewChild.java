package polymorphism;

public class ReviewChild extends ReviewParent{
	String schoolName="SkV";
	long schoolPhone=817238979;
	
	public void print() {
		super.print();
		System.out.println("School name"+schoolName);
		System.out.println("School phone"+schoolPhone);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReviewChild obj = new ReviewChild();
obj.print();
	}

}

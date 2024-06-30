package interface_example;

public class ExceptionExample2 {
	int a=10;
	
	public void eligible() {
		if(a>=18) {
			System.out.println("Eligible to vote");
		}else {
			//System.out.println("Not eligible to vote");
			throw new ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample2 obj=new ExceptionExample2();
		obj.eligible();
	}

}

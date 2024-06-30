package interface_example;

public class ExceptionExample {
	int a=10;
	public void divide() {
		try{
			int c=a/0;
			System.out.println(c);

		}catch (ArithmeticException e) {
            System.out.println("ArithmeticException is handled");
        }
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
		finally {
			System.out.println("Final exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample obj=new ExceptionExample();
		obj.divide();
	}

}

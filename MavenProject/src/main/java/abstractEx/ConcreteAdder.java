package abstractEx;

public class ConcreteAdder extends Adder {
	  public int add(int a, int b) {
	        return a + b;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Adder adder = new ConcreteAdder(); // Polymorphic behavior
	        
	        // Call the add() method to add two numbers
	        int sum = adder.add(5, 7);
	        
	        // Print the result
	        System.out.println("Sum: " + sum); // Output: Sum: 12
	}

}

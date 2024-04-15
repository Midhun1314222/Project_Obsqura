package examples;

public class AddTwo {
    int num1;
    int num2;
    
    public AddTwo(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    public int add() {
        int c = num1 + num2;
        return c;
    }
    
    public int average() {
        return (num1 + num2) / 2; 
    }
    
    public static void main(String[] args) {
        AddTwo obj = new AddTwo(10, 20); 
        
        int sum = obj.add();
        System.out.println("Sum: " + sum);
        
        int average = obj.average();
        System.out.println("Average: " + average);
    }
}


package polymorphism;

public class Main {
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();

        // Set values using setter methods
        obj.setName("John");
        obj.setAge(30);

        // Get values using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
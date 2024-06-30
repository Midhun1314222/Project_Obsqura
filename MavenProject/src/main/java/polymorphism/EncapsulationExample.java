package polymorphism;

public class EncapsulationExample {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        // Perform validation if needed
        this.name = newName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int newAge) {
        // Perform validation if needed
        if (newAge >= 0 && newAge <= 120) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
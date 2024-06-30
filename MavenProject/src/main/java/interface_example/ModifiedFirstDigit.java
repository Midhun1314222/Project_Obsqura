package interface_example;

public class ModifiedFirstDigit {
	public static void main(String[] args) {
        int startNumber = 20000;
        int endNumber = 32000;

        for (int number = startNumber; number <= endNumber; number++) {
            int firstDigit = number / 10000;
            int remainingDigits = number % 10000;

            // Modify the first digit within the range (2 to 3)
            for (int newFirstDigit = 2; newFirstDigit <= 3; newFirstDigit++) {
                if (newFirstDigit != firstDigit) {
                    int modifiedNumber = newFirstDigit * 10000 + remainingDigits;
                    System.out.println(modifiedNumber);
                }
            }
        }
    }
}

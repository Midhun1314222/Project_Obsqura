package interface_example;

import java.util.HashSet;
import java.util.Set;

public class UniqueModifiedFirstDigit {

	 public static void main(String[] args) {
	        int startNumber = 20000;
	        int endNumber = 32000;

	        for (int number = startNumber; number <= endNumber; number++) {
	            Set<Integer> modifiedNumbers = new HashSet<>();
	            int firstDigit = number / 10000;
	            int remainingDigits = number % 10000;

	            // Modify the first digit within the range (2 to 3)
	            for (int newFirstDigit = 2; newFirstDigit <= 3; newFirstDigit++) {
	                if (newFirstDigit != firstDigit) {
	                    int modifiedNumber = newFirstDigit * 10000 + remainingDigits;
	                    modifiedNumbers.add(modifiedNumber);
	                }
	            }

	            // Print only unique modified numbers
	            for (int modifiedNumber : modifiedNumbers) {
	                System.out.println(modifiedNumber);
	            }
	        }
	    }
}

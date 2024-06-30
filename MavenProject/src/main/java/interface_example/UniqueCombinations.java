package interface_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueCombinations {

	public static void main(String[] args) {
        int startNumber = 20000;
        int endNumber = 32000;
        Set<Integer> allCombinations = new HashSet<>();

        // Extract unique digits from the range (2, 3, 0, 1, 4)
        Set<Integer> uniqueDigits = new HashSet<>();
        for (int i = startNumber; i <= endNumber; i++) {
            String digits = String.valueOf(i);
            for (char digit : digits.toCharArray()) {
                uniqueDigits.add(Character.getNumericValue(digit));
            }
        }

        // Generate combinations recursively
        generateCombinations(new ArrayList<>(), uniqueDigits, allCombinations);

        System.out.println("All unique combinations between " + startNumber + " and " + endNumber + ":");
        System.out.println(allCombinations);
    }

    private static void generateCombinations(List<Integer> currentCombination, Set<Integer> availableDigits, Set<Integer> allCombinations) {
        if (currentCombination.size() == 5) {
            // Base case: 5-digit combination, convert to integer and add to set
            int combinationNumber = 0;
            for (int digit : currentCombination) {
                combinationNumber = combinationNumber * 10 + digit;
            }
            allCombinations.add(combinationNumber);
            return;
        }

        for (int digit : availableDigits) {
            currentCombination.add(digit);
            availableDigits.remove(digit); // Avoid duplicates

            generateCombinations(currentCombination, availableDigits, allCombinations);

            currentCombination.remove(currentCombination.size() - 1); // Backtrack
            availableDigits.add(digit);
        }
    }

}

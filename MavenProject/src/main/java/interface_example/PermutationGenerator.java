package interface_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationGenerator {

    public static List<Integer> generatePermutations(int number) {
        List<Integer> permutations = new ArrayList<>();
        String digits = String.valueOf(number);
        permutationsHelper(digits, new StringBuilder(), permutations);
        return permutations;
    }

    private static void permutationsHelper(String digits, StringBuilder currentPermutation, List<Integer> permutations) {
        if (digits.isEmpty()) {
            // Base case: Add the complete permutation to the list
            permutations.add(Integer.parseInt(currentPermutation.toString()));
            return;
        }

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            currentPermutation.append(digit);
            String remainingDigits = digits.substring(0, i) + digits.substring(i + 1);
            permutationsHelper(remainingDigits, currentPermutation, permutations);
            currentPermutation.deleteCharAt(currentPermutation.length() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int startNumber = 20000;
        int endNumber = 32000;
        Set<Integer> allPermutations = new HashSet<>();

        for (int number = startNumber; number <= endNumber; number++) {
            List<Integer> permutations = generatePermutations(number);
            // Filter out the original number and permutations with leading zeros
            for (int permutation : permutations) {
                if (permutation > number && String.valueOf(permutation).charAt(0) != '0') {
                    allPermutations.add(permutation);
                }
            }
        }

        System.out.println("All non-repeating permutations between " + startNumber + " and " + endNumber + ":");
        System.out.println(allPermutations);
    }
}

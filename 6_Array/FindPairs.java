import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 3, 5, 9, 2};
        int targetSum = 10;

        findPairs(arr, targetSum);
    }

    public static void findPairs(int[] arr, int targetSum) {
        HashMap<Integer, Boolean> seen = new HashMap<>();
        System.out.println("Pairs with sum " + targetSum + ":");

        for (int num : arr) {
            int complement = targetSum - num;

            if (seen.getOrDefault(complement, false)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.put(num, true);
        }
    }
}


 import java.util.Arrays;
public class countingInbuild {

    public static void countingSort(int[] arr) {
        

        
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }


    public static void inbuiltSort(int[] arr) {
        Arrays.sort(arr); 
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Counting Sort
        int[] countingArray = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original Array for Counting Sort:");
        printArray(countingArray);
        countingSort(countingArray);
        System.out.println("Sorted Array (Counting Sort):");
        printArray(countingArray);

        // Inbuilt Sort
        int[] inbuiltArray = {64, 25, 12, 22, 11};
        System.out.println("\nOriginal Array for Inbuilt Sort:");
        printArray(inbuiltArray);
        inbuiltSort(inbuiltArray);
        System.out.println("Sorted Array (Inbuilt Sort):");
        printArray(inbuiltArray);
    }
}



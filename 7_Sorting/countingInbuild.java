
public class countingInbuild{
  
public static void countingSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        max=Math.max(max, arr[i]);
    }

        int[] count = new int[max + 1];
        for (int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }


   public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] countingArray = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original Array for Counting Sort:");
        printArray(countingArray);
        countingSort(countingArray);
        System.out.println("Sorted Array (Counting Sort):");
        printArray(countingArray);
    }
}



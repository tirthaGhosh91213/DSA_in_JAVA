import java.util.Arrays;
public class quickSort {
  



    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // partition index
            QuickSort(arr, low, pi - 1);         // left side
            QuickSort(arr, pi + 1, high);        // right side
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose last element as pivot
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}



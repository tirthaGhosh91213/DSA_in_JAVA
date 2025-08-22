public class QuickSort {
   // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // last element as pivot
        int i = low;           // place for swapping

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Place pivot in the correct position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    // QuickSort function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Left side
            quickSort(arr, pi + 1, high); // Right side
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = low;         

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; 
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
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

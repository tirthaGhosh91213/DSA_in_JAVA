
public class bubbleSelectionInser {
  


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

   
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] bubbleArray = {64, 34, 25, 12, 22, 11, 90};
        int[] insertionArray = {12, 11, 13, 5, 6};
        int[] selectionArray = {64, 25, 12, 22, 11};

        // Bubble Sort
        System.out.println("Original Array for Bubble Sort:");
        printArray(bubbleArray);
        bubbleSort(bubbleArray);
        System.out.println("Sorted Array (Bubble Sort):");
        printArray(bubbleArray);

        // Insertion Sort
        System.out.println("\nOriginal Array for Insertion Sort:");
        printArray(insertionArray);
        insertionSort(insertionArray);
        System.out.println("Sorted Array (Insertion Sort):");
        printArray(insertionArray);

        // Selection Sort
        System.out.println("\nOriginal Array for Selection Sort:");
        printArray(selectionArray);
        selectionSort(selectionArray);
        System.out.println("Sorted Array (Selection Sort):");
        printArray(selectionArray);
    }


}

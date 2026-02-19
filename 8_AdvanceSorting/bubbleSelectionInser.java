
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

    public static void BubbleShort2(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int trackTurn = 0; trackTurn < arr.length - 1 - turn; trackTurn++) {
                if (arr[trackTurn] > arr[trackTurn + 1]) {
                    int temp = arr[trackTurn];
                    arr[trackTurn] = arr[trackTurn+1];
                    arr[trackTurn+1] = temp;
                }
            }

        }

    }

    public static void selectionSort2(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(small>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort2(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {100, 50, 64, 76, 92,9};
        int[] bubbleArray = {64, 34, 25, 12, 22, 11, 90};
        int[] insertionArray = {12, 11, 13, 5, 6};
        int[] selectionArray = {64, 25, 12, 22, 11};

        // Bubble Sort
        /*
        System.out.println("Original Array for Bubble Sort:");
        printArray(bubbleArray);
        bubbleSort(bubbleArray);
        System.out.println("Sorted Array (Bubble Sort):");
        printArray(bubbleArray);
        BubbleShort2(arr);
        printArray(arr);
 */
        // BubbleShort2(arr);
        // printArray(arr);

        // selectionSort(arr);
        // printArray(arr);

        insertionSort2(arr);
        printArray(arr);

        // Insertion Sort
        /*
        System.out.println("\nOriginal Array for Insertion Sort=");
        printArray(insertionArray);
        insertionSort(insertionArray);
        System.out.println("Sorted Array (Insertion Sort)=");
        printArray(insertionArray);
 */
        // Selection Sort
        /*
        System.out.println("\nOriginal Array for Selection Sort=");
        printArray(selectionArray);
        selectionSort(selectionArray);
        System.out.println("Sorted Array (Selection Sort)=");
        printArray(selectionArray);
         */
    }

}
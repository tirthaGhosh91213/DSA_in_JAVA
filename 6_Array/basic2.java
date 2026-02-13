
public class basic2 {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static int linerSearch(int arr2[], int key) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == key) {
                return arr2[i];

            }
        }
        return -1;
    }

    public static void largestElement(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        System.out.println("The max value is " + min);
    }

    public static void subArray(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + "");
                }
                System.out.println();
                tp++;

            }
            System.out.println();

        }
        System.out.println("number os sub array :-" + tp);
    }

    public static void pairArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
        int n = arr.length;

        int countPairs = (n * (n - 1)) / 2;
        System.out.println("The total number of paies " + countPairs);

    }

    public static void reverseArr(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArr2(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void subArrSumMax(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;   // Because every new subarray must start with a fresh sum = 0
                for (int k = i; k <= j; k++) {
                    sum += arr[k];

                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("The maxminum sum of the sub array :-" + max);
    }

    public static void subArrSumOptimized(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                max=Math.max(max,sum);
            }
        }
        System.out.println("The max sub array is :- "+max);
    }
public static void KadaneSubArrSum(int arr[]){
    int max=Integer.MIN_VALUE;
    int sum=0;
    
}
    public static void main(String[] args) {
        /* 
    int arr[]=new int[50];
    Scanner sc=new Scanner(System.in);

    arr[0]=sc.nextInt();
    System.out.println("The Physics naumber :- "+arr[0]);
    arr[1]=sc.nextInt();
    System.out.println("The cheminstry number is :- "+arr[1]);

    int percentage =(arr[0]+arr[1])/2;
    System.out.println("The avg is :- "+percentage+"%");

         */
 /* 
  int marks[]={67,78,90};
  update(marks);
  for(int i=0;i<marks.length;i++){
    System.out.println("The updated marks is "+marks[i]);
  }
         */

        int arr2[] = {20, 2, 18, 90, 109, 3};

        // reverseArr2(arr2);

        /*
        int result = binarySearch(arr2, 109);
        if (result == -1) {
            System.out.println("Not found ");
        } else {
            System.out.println("The element is found in the index " + result);
        }

        */

        // pairArray(arr2);

        // subArray(arr2);

        subArrSumOptimized(arr2);

        // largestElement(arr2);

        /*
        int key=18;
        int result =linerSearch(arr2, key);
        if(result==-1){ 
        System.out.println("Not found ");
            }else{
                System.out.println("The element is found in the index "+result);
        }
        */

    }
}

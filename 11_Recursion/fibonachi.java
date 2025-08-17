

public class fibonachi {
  public static int fibo(int n){
    if(n==0 || n==1){
      return n;
    }
    int fib=fibo(n-1)+fibo(n-2);
    return fib;
  }
  public static boolean isShorted(int arr[], int i){
    if(i== arr.length-1){
      return true;
    }
    if(arr[i]<arr[i+1]){
      return isShorted(arr, i+1);
    }
    return false;
  }
  public static void main(String[] args) {
    // int n=6;
    int arr[]={1,2,4,5};
    boolean result=isShorted(arr,0);
    System.out.println("The array is "+ result);
  }
}




public class BackTrackArray {
  public static  void backTrackArray(int arr[],int idx,int val){
    if(idx==arr.length){
      printArr(arr);
      return;
    }
    arr[idx]=val;
    backTrackArray(arr, idx+1, val+1);
    arr[idx]-=2;

  }
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length ; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[]=new int[5];
    backTrackArray(arr,0,1);
    printArr(arr);
  }
}

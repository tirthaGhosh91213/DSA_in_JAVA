public class findByOccrence {
  public static int firstOccrence(int arr[],int key ,int i){
    if(i==arr.length) return -1;
    if(key==arr[i]){
       return i;
    }
    return firstOccrence(arr, key, i+1);

  }
   public static int lastOccrence(int arr[],int key ,int i){
    if(i==arr.length) return -1;
    int isFound= lastOccrence(arr, key, i+1);

    if(key==arr[i] && isFound==-1){
       return i;
    }
    return isFound;
   
  }
  public static void main(String[] args) {
    int arr[]={2,3,4,6,7,8, 4,9};
    int key=4;
    int result =lastOccrence(arr,key,0);
    System.out.println("The Key is present in the arr at "+result+" this index");
  }
}

public class subArray {
  
  public static void subArr(int arr[]){
    int tp=0;
    for(int i=0;i<arr.length;i++){
      int start=i;
      for(int j=i+1;j<arr.length;j++){
        int end=j;
        for(int k=start; k<end; k++){
            System.out.print(arr[k]+",");
            tp++;
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("The total number of sub array ="+tp);
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
      subArr(arr);
  }
}

public class maxSubArrBF {
  public static void maxSubArr(int arr[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        for(int k=i;k<j;k++){
          currSum+=arr[k];

        }
         System.out.println(currSum);
        if(maxSum<currSum){
          maxSum=currSum;
         
        }
      }
      System.out.println("The maximum sum = "+maxSum);
    }
    
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};

maxSubArr(arr);

  }
}

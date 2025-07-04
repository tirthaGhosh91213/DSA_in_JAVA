public class maxSumByPrexfix {
  public static void prefixSum(int arr[]){
    int currSum=0;
    int maxSum= Integer.MIN_VALUE;
    int prefix[]=new int[arr.length];
    prefix[0]=arr[0];

    for(int i=1;i<prefix.length;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }
    for(int i=0;i<arr.length;i++){
      int start=i;
      for(int j=0;j<arr.length;j++){
        int end=j;
       currSum= start==0?prefix[end]:prefix[end]-prefix[start-1];
       if(maxSum<currSum){
        maxSum=currSum;
       }

      }
    }
    System.out.println("The sum of the sub array => "+maxSum);
  }
  public static void kadansAlgo(int arr[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      currSum+=arr[i];
      if(currSum<0){
        currSum=0;
      }
      maxSum=Math.max(currSum, maxSum);
    }
    System.out.println("The max sum of the subArray => "+maxSum);
  }
  public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    kadansAlgo(arr);
  }
}

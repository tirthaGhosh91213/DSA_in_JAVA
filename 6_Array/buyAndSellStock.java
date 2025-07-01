public class buyAndSellStock {
  public static int buyShell(int arr[]){
    int maxProfit=0;
    int buyPrice =Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(buyPrice<arr[i]){
        int profit=arr[i]-buyPrice;
        maxProfit=Math.max(maxProfit, profit);
      }
      else{
        buyPrice=arr[i];
      }
    }
  return maxProfit;
  }
  public static void main(String[] args) {
      int arr[]={7,1,5,3,6,4};
      int result=buyShell(arr);
      System.out.println(("The maxprofit = "+result));
  }
}

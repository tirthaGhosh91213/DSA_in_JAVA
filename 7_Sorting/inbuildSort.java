import  java.util.Arrays;
import java.util.Collections;


public class inbuildSort {
  public static void printArr(Integer arr[]){
   for(Integer i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}

  public static void main(String[] args) {
    Integer arr[]={5,3,2,6,7,8};
    Arrays.sort(arr);
  
    printArr(arr);
    Arrays.sort(arr,Collections.reverseOrder());
    printArr(arr);
   
  }
}

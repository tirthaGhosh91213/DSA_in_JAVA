
public class MergeShort {
  public static void  printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
     
    }
    // System.out.println();
  }
  public static void mergeShort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int mid=si+(ei-si)/2;
    mergeShort(arr, si, mid);
    mergeShort(arr, mid+1, ei);
    merge(arr,si,mid,ei);


  }
  public static void merge(int arr[],int si,int mid,int ei){
    int temp[]=new int[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid&&j<=ei){
      if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
      }
      else{
        temp[k]=arr[j];
        j++;
      }
      k++;
    }
    while(i<=mid){
      temp[k++]=arr[i++];
    }
    while(j<=ei){
      temp[k++]=arr[j++];
    }
    for(k=0,i=si;k<temp.length;k++,i++){
      arr[i]=temp[k];
    }
  }
  public static void main(String[] args) {
    int arr[]={6,7,2,5,8};
    mergeShort(arr, 0,arr.length-1);
    printArr(arr);
  }
}

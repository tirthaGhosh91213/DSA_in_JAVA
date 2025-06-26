
public class reverseArray {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int l=0;
    int h=arr.length-1;
    while(l<=h ){
      int temp=arr[h];
      arr[h]=arr[l];
      arr[l]=temp;
      l++;
      h--;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("The reverse array is "+arr[i]);
    }

  }
}

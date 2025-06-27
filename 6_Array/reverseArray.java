
public class reverseArray {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int low=0;
    int h=arr.length-1;
    while(low<=h ){
      int temp=arr[h];
      arr[h]=arr[low];
      arr[low]=temp;
      low++;
      h--;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("The reverse array is that "+arr[i]);
    }

  }
}

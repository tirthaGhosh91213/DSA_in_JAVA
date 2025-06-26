
public class largest {
  public static void main(String[] args) {
    int number[]={1,2,3,4,5,6,6,7,7};
    int max=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
      if(max<number[i]){
        max=number[i];
        
      }
    }
    System.out.println("The largest number in the array is "+max);

  }
}

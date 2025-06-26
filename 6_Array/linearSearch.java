
public class linearSearch {
  public static void main(String[] args) {
    int numbers[]={1,2,3,4,5,6,7};
    int target =7;
    for(int i =0;i<numbers.length;i++){ 
      if(numbers[i]==target){
        System.out.println("The target value is present in the array at the index "+numbers[i]);
      }
    }
  }
}

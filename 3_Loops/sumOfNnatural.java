
import java.util.Scanner;

public class sumOfNnatural{
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.err.print("Enter the natural number :-");
      int n=sc.nextInt();
      int sum =0; 
      int i=1;
      while(i<=n){
        sum =sum+i;
        i++;

      }
      System.out.println("Sum of all the  natural number "+sum );
  }
}
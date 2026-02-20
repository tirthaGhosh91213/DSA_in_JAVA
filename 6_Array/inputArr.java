
import java.util.Scanner;

public class inputArr {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    System.out.print("Enter the size of the array :- ");
   
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter values of the array :- ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The real array is :- ");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }

  }
}

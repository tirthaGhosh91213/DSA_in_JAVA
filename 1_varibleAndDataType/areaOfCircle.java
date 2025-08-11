
import java.util.Scanner;

public class areaOfCircle{
  public static void main(String[] args) {
      System.out.println("Enter the  radious of the circle =");
      Scanner sc=new Scanner(System.in);
      float rad=sc.nextFloat();
      float area =3.14f*rad*rad;
      System.out.println("The area of the circle = "+area);
  }
}

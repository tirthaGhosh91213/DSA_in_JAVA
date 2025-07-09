import java.util.*;

public class basic{
  public static void main(String[] args) {
    int marks[]=new int[10];
     Scanner sc=new Scanner(System.in);
     marks[0]=sc.nextInt();
     marks[1]=sc.nextInt();
     marks[2]=sc.nextInt();
     System.out.println("The marks obtained by the student in math :-"+marks[0]);
     System.out.println("The marks obtained by the student in physics :- "+marks[1]);
     System.out.println("The marks obtained by the student in chemistry :- "+marks[2]);
     marks[0]=marks[0]+5;
     System.out.println("In matha "+marks[0]);
     System.out.println("Length of the array is :- "+marks.length);

 
  }
}

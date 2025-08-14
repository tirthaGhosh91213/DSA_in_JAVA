

public class printDecrisingNo {
  public static  void PrintDec(int n){
    if(n==1){
      System.out.println(1);
      return;
    }
    System.out.print(n+" ");
    PrintDec(n-1);
  }
  public static  void PrintInc(int n){
    if(n==1){
      System.out.print(1+" ");
      return;
    }
    PrintInc(n-1);
    System.out.print(n+" ");
    
  }
  public static  int  fact(int n){
    int factorial;
    if(n==0){
      
      return  1;
    }

   factorial= n*fact(n-1);
   return factorial;
    
  }
  public static void main(String[] args) {
    int n=8;
    PrintDec(n);
    PrintInc(n);
    int result=fact(n);
    System.out.println("\n");
    System.out.println(result);
  }
}

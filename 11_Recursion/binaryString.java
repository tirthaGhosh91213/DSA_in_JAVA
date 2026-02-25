public class binaryString {
  public static void binaryString(int n, int lastPlace,String str){
    if(n==0){
      System.out.println(str);
      return;
    }
    binaryString(n-1, 0, str+"0");
    if(lastPlace==0){
      binaryString(n-1, 1, str+"1");
    }
  }
  public static void printDec(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }
   public static void printInc(int n){
    if(n==1){
      System.out.print(n+" ");
      return;
    }
    printInc(n-1);
    System.out.print(n+" ");
    
  }
  public static void main(String[] args) {
    // binaryString(3, 0, "");
    printInc(10);
  }
}

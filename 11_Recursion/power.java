public class power {
  public static int optimizePower(int x,int n){
    if(n==1) return  x;
    int halfpower=optimizePower(x, n/2);
    int  halfFunction=halfpower*halfpower;
    return halfFunction;
  }
  public static int power(int x,int n){
    if(n==1){
      return x;
    }
    int pow =x*power(x, n-1);
    return pow;
  }
  public static void main(String[] args) {
    int x=5;
    int n=2;
    System.out.println("The power is "+optimizePower(x, n));
  }
}

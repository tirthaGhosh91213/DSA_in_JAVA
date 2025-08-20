public class friendPairing{
  public static int friendPair(int n){
    if(n==1||n==2){
      return n;
    }
    int single=friendPair(n-1);
    int pair=friendPair(n-2);
    int result=single+(n-1)*pair;
    return result;
  }
  public static void main(String[] args) {
    System.out.println(friendPair(3));
  }
}
public class prime{

  public static void main(String[] args) {
      int n=9;
      if(n==2){
        System.out.println("N is prime ");
      }
      else{
        boolean Prime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0){
            Prime=false;
          }
        }
       if(Prime==true){
        System.out.println("The number is prime ");
       }
       else{
        System.out.println("composite");
       }
       }
      }
  }

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
  public static int sumNatural(int n){
    if(n==1){
      // System.out.println(n);
      return 1;
    
    }
    return n+sumNatural(n-1);
  }
   public static int factorial(int n){
    if(n==0 || n==1){
      return 1;
    }
 return  n*factorial(n-1);
    
  }
   public static void printInc(int n){
    if(n==1){
      System.out.print(n+" ");
      return;
    }
    printInc(n-1);
    System.out.print(n+" ");
    
  }
  public static int fibonacci(int n){
    if(n==0||n==1){
      return n;
    }
    int fb=fibonacci(n-1)+fibonacci(n-2);
    return fb;
  }
  public static boolean shortedArr(int arr[],int i){
    if(i==arr.length-1){
      return true;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return shortedArr(arr, i+1);
  }
  public static int firstOccurence(int arr[],int key,int i){
    if(i==arr.length){
      return -1;
    }
    if(arr[i]==key){
      return i+1;
    }
    return firstOccurence(arr, key, i+1);


  }
  public static int lastOccurence(int arr[],int key,int i){
    if(i==arr.length){
      return  -1;
    }
    int occurence= lastOccurence(arr, key, i+1);
    if(occurence==-1 && arr[i]==key){
      return i+1;
    }
    return occurence;
  }

  public static int powerFunction(int n,int x){
    if(n==0){
      return 1;
    }
    return x*powerFunction(n-1, x);
  }

  public static int powerOpt(int n,int a){
    if(n==0) return 1;
    int halfpower=powerOpt(n/2, a);
    int halfPowersqrt=halfpower*halfpower;
    if(n%2!=0){
      halfPowersqrt= a*halfPowersqrt;
    }
    return halfPowersqrt;
  }
  public static void main(String[] args) {
    // binaryString(3, 0, "");
    // printInc(10);
    // System.out.println("The factorila is :- "+factorial(3));
    // System.out.println("The sum of N natural number is  is :- "+sumNatural(5));
   /*  int n=5;
    for(int i=0;i<n;i++){
       System.out.print(fibonacci(i)+" ");
    }
   */
  int arr[]={1,10,3,4,5,10};

  // System.out.println(shortedArr(arr, 0));

  // System.out.println(lastOccurence(arr,10,0));

  System.out.println(powerOpt(2,3));


   
    
  }
}

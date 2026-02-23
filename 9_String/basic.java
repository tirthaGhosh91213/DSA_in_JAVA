
public class basic {
  public static void printChar(String str){
    for(int i=0;i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
    }
  }
  public static void checkPalindrome(String str){
    int len=str.length();
    for(int i=0; i<len/2 ; i++){
      if(str.charAt(i)==str.charAt(len-i-1)){
        System.out.println("The string is palindrom");
       return;
      }
     
    
    }
     System.out.println("Not a palindrome ");
     
  }
  
  public static void getShortestPath(String str){
    int x=0,y=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='E'){
        x++;
      }
      else if(str.charAt(i)=='W'){
        x--;
      }
      else if(str.charAt(i)=='N'){
        y++;
      }
      else y--;
    }
    int x2=x*x;
    int y2=y*y;
    double root =Math.sqrt(x2+y2);
    System.out.print("The shortest root is :- "+root);

  }
  public static void checkEqale(String str1,String str2){
    if(str1.equals(str2)){
      System.out.println("The strings are quales ");
    }
    else{
      System.out.println("Not quales ");
    }
  }
  public static void printSubstring(String str,int st,int en ){
    String subStr="";
    for(int i=st;i<en;i++){
      subStr+=str.charAt(i);
    }
    System.out.println(subStr);
  }
  public static void main(String[] args) {

    // char ch[]={'a,'b,'c','d','e'};
    // String str="Tirtha ";
    // System.out.println("String is: "+str);
    // Scanner sc=new Scanner(System.in);
    // String name=sc.nextLine();
    // System.out.println("My name is "+name);
    // System.out.println(name.length());
    // String firstName="Tirtha ";
    // String secondName="Ghosh";
    // String fullName=firstName+" "+secondName;
    // System.out.println("Full Name is= "+fullName);
    // System.out.println(fullName.charAt(0));
    // for(int i=0;i<fullName.length();i++){
    //   System.out.print(fullName.charAt(i)+" ");
    // }

    // char ch[]={'q','r','s','t'};
    // String str="Tirtha"; 

    // System.out.println(ch);
    // System.out.println(str);

    String fName="noon";
    String lName="WNEENESENNN";
    String Fullname =fName+" "+lName;
    // printChar(Fullname);
    // checkPalindrome(Fullname);
    // getShortestPath(lName);
    checkEqale(fName,lName);
    printSubstring(lName,0,5);

  }
}

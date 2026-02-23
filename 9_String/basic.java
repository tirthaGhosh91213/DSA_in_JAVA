
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

    char ch[]={'q','r','s','t'};
    String str="Tirtha"; 

    // System.out.println(ch);
    // System.out.println(str);

    String fName="noon";
    String lName="Ghosh";
    String Fullname =fName+" "+lName;
    // printChar(Fullname);
    checkPalindrome(fName);

  }
}



public class palindrome {
  public static boolean Palindrome(String str){
    
    for(int i=0;i<str.length()/2;i++){
      if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        return false;
      }
    }
    return true;

  }
  public static void main(String[] args) {
    String str="madam";
    boolean result=Palindrome(str);
    if(result==true){
      System.out.println("The string is a Palindrome");
      


    }
    else{
      System.out.println("The string is not a Palindrome");
    }
  }
}

public class findSubset_permutation {
  public static void findSubSet(String str,String ans,int idx){
    if(idx==str.length()){
       if(ans.length()==0){
      System.out.println("null");
    }else{
      System.out.println(ans);
    }
    return;
    }
    findSubSet(str, ans+str.charAt(idx), idx+1);
    findSubSet(str, ans, idx+1);
    
   
  }
  public static void findPermutation(String str,String ans){
    if(str.length()==0){
      System.out.println(ans);
      return;
    }
    for(int i=0;i<str.length();i++){

      char current = str.charAt(i);
      String newString=str.substring(0,i)+str.substring(i+1);
      findPermutation(newString, ans+current);

    }

  }
  public static void main(String[] args) {
    String str="abc";
    findSubSet(str," ",0);
    findPermutation(str,"");

  }
}

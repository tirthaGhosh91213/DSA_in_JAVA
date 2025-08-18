public class removeDuplicate {
  public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
    if(idx==str.length()){
      System.out.println(newStr);
      return;
    }
    char curChar=str.charAt(idx);
    if(map[curChar-'a']==true){
      removeDuplicate(str, idx+1, newStr, map);
    }
    else{
      map[curChar-'a']=true;
      removeDuplicate(str, idx+1, newStr.append(curChar), map);
    }
  }
  public static void main(String[] args) {
    String str="tirtha";
    removeDuplicate(str, 0, new StringBuilder("") , new boolean[26]);
  }
}

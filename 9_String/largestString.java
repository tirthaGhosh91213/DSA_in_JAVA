public class largestString {
  public static void main(String[] args) {
    String fruits[]={"apple","banana","mango"};
    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++){
      if(largest.compareTo(fruits[i])<1){
        largest=fruits[i];
      }
     
    }
    System.out.println(" The largest sentance = "+largest);
    
  }
}

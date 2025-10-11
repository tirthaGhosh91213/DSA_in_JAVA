
import java.util.ArrayList;

public class mostWaterBF {
  public static int mostWater(ArrayList<Integer> height){
    int maxWater=0;
    for(int i=0;i<height.size();i++){
      for(int j=i+1;j<height.size();j++){
        int high=Math.min(height.get(i), height.get(j));
        int width=j-i;
        int water=high*width;
        if(maxWater<water){
          maxWater=water;
        }
        

      }
      
    }
    return maxWater;
    
  }
  public static int mostWterInTwoPointer(ArrayList<Integer> height){
    int maxWater=0;
    int lp=0;
    int rp=height.size()-1;
    while (lp<rp) {
      int hi=Math.min(height.get(lp), height.get(rp) );
      int width=rp-lp;
      int currentWter=hi*width;
      if(currentWter>maxWater){
        maxWater=currentWter;
      }
      if(height.get(lp)<height.get(rp)){
        lp++;
      }else{
        rp--;
      }
    }
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height=new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    int result =mostWterInTwoPointer(height);
    System.out.println(result);
  }

}

import java.util.ArrayList;

public class pairSum2 {
  public static boolean pairsum(ArrayList<Integer> list,int target){
    int bp=-1;
    for(int i=0;i<list.size()-1;i++){
      if(list.get(i)>list.get(i+1)){
        bp=i;
        break;
      }
    }
    int lp=bp+1,rp=bp;
    while(lp!=rp){
      if(list.get(lp)+list.get(rp)==target){
        return true;

      }
      if(list.get(lp)+list.get(rp)<target){
        lp=(lp+1)%list.size();
      }else{
        rp=(list.size()+rp-1)%list.size();
      }
    }
    return false;
   }
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(10);
    int target =25;
    System.out.println(pairsum(list, target));
  }
}

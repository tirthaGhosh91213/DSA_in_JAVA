public class trappingRainWater{
  public static int trappingWater(int hight[]){
    int leftMax[] = new int[hight.length];
    leftMax[0]=hight[0];
    for(int i=1;i<hight.length;i++){
        leftMax[i]=Math.max(hight[i], leftMax[i-1]);
    }
    int rightMax[]=new int[hight.length];

    rightMax[hight.length-1]=hight[hight.length-1];
    for(int j=hight.length-2;j>=0;j--){
        rightMax[j]=Math.max(rightMax[j+1], hight[j]);
    }
    int trappedWater=0;
for(int i=0;i<hight.length;i++){
  int waterLevel=Math.min(leftMax[i], rightMax[i]);
  trappedWater+=(waterLevel-hight[i])*1;
}
return trappedWater;

  }
  public static void main(String[] args) {
    int hight[]={4,2,0,6,3,2,5};
    int volume=trappingWater(hight);
    System.out.println("The volume of the water => "+volume);

  }
}

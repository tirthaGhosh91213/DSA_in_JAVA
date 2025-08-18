public class TilingProblem {
  public static int tilingProblem(int n){
    if(n==0||n==1){
      return 1;
    }
    int vartical=tilingProblem(n-1);
    int horizontal=tilingProblem(n-2);
    int totalWayes=vartical+horizontal;
    return totalWayes;
  }
  public static void main(String[] args) {
    int n=4;
    int result=tilingProblem(n);
    System.out.println(result);
  }
}

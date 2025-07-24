
public class fumctionInArr {
  public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
      marks[i]=marks[i]+1;
    }
  }
  public static void main(String[] args) {
    int marks[]={90,89,92};
    update(marks);
    for(int i=0;i<marks.length;i++){
      System.out.println("The incresed marks = "+marks[i]+" ");
    }
  }
}

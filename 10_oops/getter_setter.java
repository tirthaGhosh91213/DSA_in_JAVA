public class Getter_Setter {
  
  public static void main(String[] args) {
    Pen obj=new Pen();
    obj.setColor("Blue");
    System.out.println(obj.getColor());
    obj.setTip(5);
    System.out.println(obj.getTip());

  }
}
class Pen{
  private String color;
  private int tip;
  String getColor(){
    return this.color;
  }
  int getTip(){
    return this.tip;
    
  }
  void setColor(String color){
    this.color=color;
  }
  void setTip(int tip){
    this.tip=tip;
  }
}


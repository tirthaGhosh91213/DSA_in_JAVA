public class superKey {
  public static void main(String[] args) {
    Fish f1=new Fish();
    System.out.println(f1.color);
  }
}
class Animal{
  String color;
  Animal(){
System.out.println("animal is called....");
  }
    
  
}
class Fish extends Animal{
  Fish(){
    super.color="White";
    System.out.println("Fish isn called...");
  }
}

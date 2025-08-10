public class Abstraction {
  public static void main(String[] args) {
    cow c=new cow();
    c.eat();
    System.out.println(c.color);
    c.walk();
    chicken chi=new chicken();
    chi.eat();
    chi.walk();
  }
}
abstract class Animal{
  String color;
  Animal(){
    color ="Bround";
  }
  void eat(){
    System.out.println("Animal can eat.....");
  }
  abstract void walk();
}
class cow extends Animal{
 
    void changeColor(){

    color="white";
  }
  void walk(){
    System.out.println("Cow can walks on 4 legs....");
  }
}
class chicken extends Animal{
  void walk(){
    System.out.println("Chicken can walks on 2 legs....");
  }
}
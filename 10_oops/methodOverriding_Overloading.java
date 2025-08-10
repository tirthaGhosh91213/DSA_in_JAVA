public class methodOverriding_Overloading {
  public static void main(String[] args) {
    // Calculator cal=new Calculator();
    // cal.sum(2.3, 3.4);
    // cal.sum(2, 3,5);
    // cal.sum(2, 3);
    Animal ani=new Animal();
    ani.eat();
    Deer deer=new Deer();
    deer.eat();
  }
}

// overloading
class Calculator{
  void  sum(int a,int b){
    System.out.println("The sum ="+(a+b) );
  }
  void sum(int a,int b, int c){
    System.out.println("The sum ="+(a+b+c));
  }
  void sum(double a,double b){
    System.out.println("The sum ="+(a+b));
  }
}

// overriding
class Animal{
  void eat(){
    System.out.println("Animal eat anything ....");
  }
}
class Deer{
  void eat(){
    System.out.println("Deer eat grass...");
  }
}

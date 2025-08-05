public class constructor {
  public static void main(String[] args) {
    Student obj =new Student("Tirtha");
    Student obj1 =new Student(20);
    Student obj2 =new Student();
    
    System.out.println(obj.name);
    System.out.println(obj1.age);
  }

}
class Student{
  String name;
  int age;
//constructor 
  Student(String name){
    this.name=name;
  }
  Student(int age){
    this.age=age;
  }
  Student(){
    System.out.println("Hey Tirtha how are you i am a constructor !");
  }
  
}

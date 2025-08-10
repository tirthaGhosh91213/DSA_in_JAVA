public class staticKey {
  public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student();
    s1.schoolName="KHS";

  
    s2.schoolName="KHS2";
    System.out.println(s1.schoolName);
    System.out.println(s2.schoolName);
  }
}
class Student{
  static int calculatePersentage(int math,int physics, int chem){
    return (math+physics+chem)/3;
  }
  String name;
  int age;
  static String schoolName;
  void setName(String name){
    this.name=name;
  }
  String getName(){
    return this.name;
  }
}
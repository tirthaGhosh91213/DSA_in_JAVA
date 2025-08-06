public class constructor {
  public static void main(String[] args) {
    // Create student s1
    Student s1 = new Student();
    s1.name = "Mrittika";
    s1.age = 20;
    s1.password = "mati123";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 99;

    // Copy student s1 into s2 (deep copy)
    Student s2 = new Student(s1);
    s2.password = "xyz123";

    // Change one mark in s1
    s1.marks[2] = 92;

    // Print s1's marks
    for (int i = 0; i< 3; i++) {
      System.out.println(s2.marks[i]);
    }

    // If you want to test these constructors, uncomment them:
    Student obj = new Student("Tirtha");
    Student obj1 = new Student(20);

    System.out.println(obj.name);
    System.out.println(obj1.age);
  }
}

class Student {
  String name;
  int age;
  String password;
  int marks[];

  // Copy constructor (deep copy)
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.age = s1.age;
    this.marks= s1.marks;
  }

  // String constructor
  Student(String name) {
     marks = new int[3];
    this.name = name;
  }

  // Integer constructor
  Student(int age) {
     marks = new int[3];
    this.age = age;
  }

  // Default constructor
  Student() {
    marks = new int[3];
    System.out.println("Hey Tirtha, how are you? I am a constructor!");
  }
}

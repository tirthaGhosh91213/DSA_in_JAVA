public class inheritance {

    // Superclass
    class Animal {
        String name;

        public void eat() {
            System.out.println(name + " is eating...");
        }

        public void sleep() {
            System.out.println(name + " is sleeping...");
        }
    }

    // Subclass
    class Dog extends Animal {
        public void bark() {
            System.out.println(name + " is barking...");
        }
    }

    public static void main(String[] args) {
        inheritance outer = new inheritance();
        Dog dog = outer.new Dog(); 
        dog.name = "Tommy";

        dog.eat();   
        dog.sleep();  
        dog.bark();   
    }
}

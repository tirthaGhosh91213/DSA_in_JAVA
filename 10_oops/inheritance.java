public class inheritance {

    // Base class (level 1)
    class Animal {
        void eat() {
            System.out.println("Animal is eating...");
        }
    }

    // Derived class (level 2)
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking...");
        }
    }

    // Derived class (level 3)
    class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping...");
        }
    }

    
    public static void main(String[] args) {
        inheritance outer = new inheritance();
        Puppy puppy = outer.new Puppy();

        puppy.eat();   
        puppy.bark();  
        puppy.weep();  
    }
}

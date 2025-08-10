public class inheritance {

    static class Animal {
        void eat() {
            System.out.println("Animal is eating......");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking......");
        }
    }

    static class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping......");
        }
    }
    static class Fish extends Animal{
        void swing(){
            System.out.println("Fish can swiming ....");
        }
    }
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        Fish ruih=new Fish();
        ruih.swing();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}

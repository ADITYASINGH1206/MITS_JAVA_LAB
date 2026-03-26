// Grandparent
class Animal {
    void eat() { System.out.println("Eating..."); }
}

// Parent (Inherits from Animal)
class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

// Child (Inherits from Dog, and thus also has Animal features)
class BabyDog extends Dog {
    void weep() { System.out.println("Weeping..."); }
}

public class Experiment_19 {
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        BabyDog d = new BabyDog();
        d.eat();  // From Grandparent
        d.bark(); // From Parent
        d.weep(); // From Child
    }
}
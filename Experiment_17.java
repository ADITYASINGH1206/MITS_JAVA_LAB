
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Experiment_17{
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        System.out.println("Name : Aditya Kumar Singh"+ "\n" + "Roll no: BTAD24O1005" +"\n" +"Sem : IV");
        Dog d = new Dog();
        d.bark();
    }
}
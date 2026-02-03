

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}   

class puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class Experiment_18{
    public static void main(String args[]) {
        System.out.println("Name : Aditya Kumar Singh"+ "\n" + "Roll no: BTAD24O1005" +"\n" +"Sem : IV");
        puppy p = new puppy();
        p.weep();
        p.bark();
        p.eat();
    }
}
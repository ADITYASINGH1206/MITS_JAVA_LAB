import java.util.Scanner;
class Person{
    String name;
    int age;
    String branch;

    Person(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}
class Experiment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your branch: ");
        String branch = sc.next();

        Person person = new Person(name, age, branch);
        person.displayInfo();

        sc.close();
    }
}
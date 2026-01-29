import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Branch: ");
        String branch = sc.next();
        System.out.println("My name is: " + name);
        System.out.println("My age is " + age);
        System.out.println("My branch is " + branch);
        sc.close();
    }
}

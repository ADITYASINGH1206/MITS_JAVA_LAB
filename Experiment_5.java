import java.util.Scanner;

class Experiment_5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks;
    System.out.print("Enter your marks: ");
    marks = sc.nextInt();
    switch(marks/10){
        case 10:
            System.out.println("Grade AA");
        case 9:
            System.out.println("Grade A");
            break;
        case 8:
            System.out.println("Grade B");
            break;
        case 7:
            System.out.println("Grade C");
            break;
        case 6:
            System.out.println("Grade D");
            break;
        case 5:
            System.out.println("Grade E");
            break;
        default:
            System.out.println("Grade F");
        }   
    sc.close();
    }
}
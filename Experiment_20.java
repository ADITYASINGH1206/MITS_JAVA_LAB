public class Experiment_20 {
    public static void main(String args[]){
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");

        }
        finally{
            System.out.println("Done");
        }
    }
}

public class Experiment_21 {
    static void check(int age) throws Exception{
        if (age < 18){
            throw new Exception("Not Eligible");
        }
            
    }
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        try {
            check(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

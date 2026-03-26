import java.util.ArrayList;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH "+"\n"+"BTAD24O1005");
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("A");




        
        list.add("B");
        list.add("C");
        
        list.add("A");
        
        System.out.println("Original List: " + list);
        
        list.remove("B"); 
        list.add("D");
        
        System.out.println("Modified List: " + list);
    }
}
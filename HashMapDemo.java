import java.util.HashMap;

public class HashMapDemo {
    
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "A");
        map.put(2, "B");
        
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Original Map: " + map);
        
        map.put(1, "C");
        
        System.out.println("Modified Map: " + map);
    }
}
import java.util.HashSet;

public class HashSetDemo {
    
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        
        HashSet<String> set = new HashSet<>();
        
        set.add("Java");
        set.add("Python");
        set.add("Ruby");
        set.add("C++");
        
        set.add("Java");
        
        System.out.println("Set elements: " + set);
    }
}
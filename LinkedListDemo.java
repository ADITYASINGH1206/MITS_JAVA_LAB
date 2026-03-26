import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        System.out.println("ADITYA KUMAR SINGH"+"\n"+"BTAD24O1005");
        
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        
        list.addFirst(5);
        list.addLast(25);
        
        System.out.println("Original List: " + list);
        
        list.add(2, 15);
        
        System.out.println("After Insertion: " + list);
        
        list.removeFirst();
        list.remove(1);
        
        System.out.println("After Deletion: " + list);
    }
}
import java.util.LinkedList;
public class Java_collection_framework {
    public static void main(String[] args) {

        // using the inbuilt linkedList datastructure 
        //creating - objects of linkedlist 
        LinkedList<Integer> ll = new LinkedList<>(); 
        // in collection frameworks - store datatype of objects/class not primitives - whether arraylist, or linkedlist , etc
        // so primitives (int , float , char , boolean)  --->replaced by (classInteger, Float, Character , Boolean ) 

        // adding elements
        ll.addLast(5);
        ll.addLast(45);
        ll.add(1, 56);
        ll.addFirst(45);
        //[45, 5, 56, 45]
        
        // print is simple 
        System.out.println(ll);  //  [45, 5, 56, 45]
        
        // remove 
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
        
        
        
    }
    
}

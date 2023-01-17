import java.security.Principal;

public class L1_detect_a_cyclic_linked_list{
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();

        //adding elements in linked list 
        ll.addfirst(5);
        ll.addfirst(8);
        ll.addfirst(19);

        ll.printLinkedList();

        

        
    }
}
class LinkedList2{
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;

        }


    }
    public static Node head;
    public static Node tail;



// ************************ addFirst method in lilnked list **********************************

    void addfirst(int data){
        Node newNode = new Node(data);
        newNode.data=data;
        newNode.next = head;
        head = newNode;


    }

    // ********************** print linked list ****************************************
    void printLinkedList(){
        
        
        Node temp=head;
        if(temp == null){
            System.out.println("null");
        }
        while(temp!= null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }

    
}
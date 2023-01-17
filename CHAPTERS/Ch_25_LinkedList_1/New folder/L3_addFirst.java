public class L3_addFirst {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        
    }

}

class LinkedList {
    class Node{
        int data;   // properties of linkedlist
        Node next;  // properties of linkedlist

        Node(int data){
            this.data = data;
            this.next =null;

        }
    }

    //creating head and tail properties in linkedList class --> not under Node class

    Node head;     // properties of linkedlist
    Node tail;     // properties of linkedlist
    

    // adding few functions in LinkedList class --> not under Node class

    // (1) addFirst();
    
    public void addFirst(int data){
        // step 1--> create a new node
        Node newNode = new Node(data);

            // corner case--> if there was node earlier i.e. null --> then now this newNode is head and tail both --> after this no need to go to step 2 and 3
            if(head == null){
                head = tail = newNode;
                return;
            }

        // step 2 --> newnode next = head;
        newNode.next = head; // linking this node with next node;

        // step 3 --> change head  to newNode
        head = newNode;

    }
    
}

public class L6_add_in_middle {
    public static void main(String[] args) {
        
    }

}
class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        
        }

    }
    Node head;
    Node tail;


    


    void add(int idx, int data1){
        //corner case -> if idx = 0; then simply call addFirst function;
        if(idx ==0){
            addFirst(data1);
            return;
        }
        Node temp = head;
        int i=0;
        while(i<idx-1){ // stopping at previous node , after which we have to add newNode

            temp = temp.next; // making next node as temp i.e moving pointer; and increasing counter i
            i++;

        }// after reaching the previous node now exit the loop and create a new node 

        Node newNode = new Node(data1);

        // before connecting temp (or previous node) to this new node , first connect newNode to the next node of previous( or current temp  node ka next wala node) , i.e temp.next, othereise link to the (next of previous) will be lost.

        newNode.next = temp.next;
        temp.next = newNode;




    }


}

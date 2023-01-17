public class L5_printAll {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);

        ll.printAll();
    }
}

class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }  
    }
    Node head;
    Node tail;
    int size;
    
    // adding addLast function in LinkedList Class
    void addlast(int data){

        // step1 --> create a new node;
        Node newNode = new Node(data);

            //corner case --> if earlier there was only null node--> now newNode will be head and tail both 
            
            if(head == null){
                head = tail = newNode;
                return;   //no need to go to step 2 and 3 now;
            }

        //step2 --> link it with previous tail node (tail.next)
        tail.next = newNode;

        //step3 --> change the tail and make newNode as new tail
        tail =newNode;
        size ++;
    }

    // adding printAll function in LinkedList Class
    void printAll(){
        if(head== null){// optional  : without this it will just print null;
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}

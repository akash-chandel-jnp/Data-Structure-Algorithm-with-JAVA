import java.util.HexFormat;

import org.w3c.dom.html.HTMLAreaElement;

public class L20_all_functions_combined {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.printAll();
        // System.out.println("size " + ll.size );


        // ll.addFirst(2);
        // ll.printAll();
        // System.out.println("size " + ll.size );

        // ll.addFirst(1);
        // ll.printAll();
        // System.out.println("size " + ll.size );

        // ll.addlast(3);
        // ll.printAll();
        // System.out.println("size " + ll.size );

        // ll.addlast(4);
        // ll.printAll();
        // System.out.println("size " + ll.size );

        // ll.add(3, 15);
        // ll.printAll();
        // System.out.println("size " + ll.size );

        // // System.out.println("size " + ll.size );


        // *** calling palindrome function 
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);

        System.out.println(ll.checkPalindrome());

        

        
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
    public static Node head;
    public static Node tail;
    public static int size =0;
    

    // ********************************* ADD FIRST ***************************************** 

    public void addFirst(int data){
        
        Node newNode = new Node(data);
        size++;

        if(head == null){ // adding first node , earlier head was null;
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // ************************************ ADD LAST ***************************************** 

    void addlast(int data){

        
        Node newNode = new Node(data);
        size ++;
 
            if(head == null){
                head = tail = newNode;
                return;  
            }        
        tail.next = newNode;
        tail =newNode;
        
    }

    // *************************** PRINT ALL ***************************************** 

    void printAll(){
        if(head== null){ 
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // *************************** ADD IN THE MIDDLE ***************************************** 
    void add(int idx, int data1){
        if(idx ==0){
            addFirst(data1);
            return;
        }
        
        Node temp = head;
        int i=0;
        while(i<idx-1){ 

            temp = temp.next; 
            i++;

        }

        Node newNode = new Node(data1);
        size++;

        newNode.next = temp.next;

        temp.next = newNode;

    }

    // *********************************RECURSIVE SEARCH**************************************

    int recSearch(int key){
        return helper(key , head);

    }

    private int helper(int key, LinkedList.Node head2) {
        return 0;
    }

    // ********************************** REVERSE A LINKED LIST ********************************
    void reverseList(Node head){

        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }


    // ********************************* FIND MIDDLE NODE **************************************

    //slow fast approach
    public Node findMidNode(Node head){ // HELPER for palindrome check functions
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my middle node
    }


// *********************************FIND MIDDLE NODE **************************************
    public boolean checkPalindrome (){
        //corner case --> if list is null or one node only --> return true
        if(head == null || head.next == null){
            return true;
        }

        // step1 --> find mid
        Node midNode = findMidNode(head);


        // step2 --> reverse 2nd half -->3 variables & 4 steps -->same as earlier created -> prev lec
        Node prev = null;
        Node curr = midNode; // only this is changed --> earlier this was head -> as whole list was rev
        Node next;
        while(curr != null){
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;// right head half  --> right = prev; just at the end of the reverse process
        Node left = head;

        // step3 --> check left half & right half
        while (right != null){ 
            if(left.data != right.data){
                return false;
            }
            left = left.next ;
            right = right.next ;
    
        } return true ;

    }

}
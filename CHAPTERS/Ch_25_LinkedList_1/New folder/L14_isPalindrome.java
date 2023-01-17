public class L14_isPalindrome {
    /* easiest method is to copy data of palindrome into an array or string and check whether array or string is palinfrom or not: 

    TIME COMPLEXITY is O(n)   
    SPACE COMPLEXITY is O(n)   as extra space is used for creating array or string  */    

/*
  this question is very important as we will learn a very important concept of SLOW AND FAST:

  we have to solve this in 3 steps:
  step 1) find middle
  step 2) 2nd half Reverse
  step 3) check if 1st half(left) = 2nd half(right)
 */


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

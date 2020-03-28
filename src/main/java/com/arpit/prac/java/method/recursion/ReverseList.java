package com.arpit.prac.java.method.recursion;

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        return reverseUtil(null, head);

    }

    private ListNode reverseUtil(ListNode previousNode, ListNode currentNode) {

        if(currentNode == null){
            return previousNode;
        }

        ListNode nextNode = currentNode.next;

        currentNode.next = previousNode;



        return reverseUtil(currentNode, nextNode);

    }


    public ListNode swapHelper(ListNode currentHead, ListNode head){
        if(currentHead != null && currentHead.next != null){
            int temp = currentHead.val;
            int next = currentHead.next.val;

            currentHead.val = next;
            currentHead.next.val = temp;
            System.out.println(temp +"->"+ next);

           return swapHelper(currentHead.next.next, head);

        }else {
            return head;
        }

    }


    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode three = new ListNode(3);

        ListNode four = new ListNode(4);

        first.next = second;
        second.next = three;
        three.next = four;

        ReverseList solution = new ReverseList();
       ListNode node = solution.reverseList(first);

       while (node != null){

           System.out.print(node.val+ " ");


           node = node.next;

       }




    }
}

package com.arpit.prac.java.method.recursion;

public class SolutionLinkList {
    public ListNode swapPairs(ListNode head) {


        return swapHelper(head, head);

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

        SolutionLinkList solution = new SolutionLinkList();
       ListNode node = solution.swapPairs(first);

       while (node != null){

           System.out.print(node.val+ " ");


           node = node.next;

       }




    }
}

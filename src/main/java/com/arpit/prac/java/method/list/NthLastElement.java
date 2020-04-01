package com.arpit.prac.java.method.list;

import com.arpit.prac.java.method.recursion.ListNode;

public class NthLastElement {

    public static void main(String[] args) {
        NthLastElement nthLastElement = new NthLastElement();

        ListNode head = new ListNode(0);

        ListNode current_node = head;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        head.next = l1;


       ListNode nthLast =  nthLastElement.findElement(l1, 1);

        if (null != nthLast) {

            System.out.print(nthLast.val + " -> ");

        }
    }

    private ListNode findElement(ListNode head, int nthLast) {

        ListNode current_node = head;

        ListNode nthLast_node = head;


        int index = 1;

        while(null != current_node){
            System.out.println(current_node.val +" --- "+ nthLast_node.val);


            if(index <= nthLast+1){
                nthLast_node = head;
            }else {
                nthLast_node = nthLast_node.next;
            }
            index++;

            current_node = current_node.next;
        }



        return nthLast_node;
    }


}

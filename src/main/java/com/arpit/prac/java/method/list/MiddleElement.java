package com.arpit.prac.java.method.list;

import com.arpit.prac.java.method.recursion.ListNode;

public class MiddleElement {


    public static void main(String[] args) {
        MiddleElement middleElement = new MiddleElement();

        ListNode head = new ListNode(0);

        ListNode current_node = head;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);

        l3.next = l4;
        l4.next = l5;

        head.next = l1;

        System.out.println(middleElement.finndMiddleElement(l1).val);

    }

    private ListNode finndMiddleElement(ListNode l1) {

        ListNode fast_pointer = l1;
        ListNode slow_pointer = l1;

        while (null != fast_pointer){


            if(fast_pointer.next != null ){
                fast_pointer = fast_pointer.next.next;

            }else{
                break;
            }

            slow_pointer = slow_pointer.next;


        }

        return slow_pointer;
    }

}

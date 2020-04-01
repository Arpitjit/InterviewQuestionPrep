package com.arpit.prac.java.method.list;

import com.arpit.prac.java.method.recursion.ListNode;

public class ReverseLinkList {

    public static void main(String[] args) {

        ReverseLinkList reverseLinkList = new ReverseLinkList();
        ListNode head = new ListNode(0);

        ListNode current_node = head;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l3.next = l4;
        l4.next = l5;

        head.next = l1;

        ListNode output = reverseLinkList.reverse(l1);

        while(null != output){
            System.out.println(output.val);
            output = output.next;
        }
    }

    private ListNode reverse(ListNode head) {

        ListNode previous_node = null;
        ListNode current_node = head;

        while (null != current_node){

            ListNode temp = current_node.next;

            current_node.next = previous_node;

            previous_node = current_node;

            current_node = temp;

        }

        return previous_node;
    }
}

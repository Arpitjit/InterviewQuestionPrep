package com.arpit.prac.java.method.list;

import com.arpit.prac.java.method.recursion.ListNode;
import sun.text.normalizer.Trie;

public class DeleteNode {

    public static void main(String[] args) {
        DeleteNode linkList = new DeleteNode();

        ListNode head = new ListNode(0);

        ListNode current_node = head;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(5);

        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        head.next = l1;


        linkList.detelte(l5);

        while (null != head) {

            System.out.print(head.val + " -> ");

            head = head.next;

        }
    }

    private void detelte(ListNode l5) {

        if(l5 == null && l5.next == null){
            return;
        }


        ListNode nextNode = l5.next;

        l5.val = nextNode.val;

        l5.next = nextNode.next;
    }


}

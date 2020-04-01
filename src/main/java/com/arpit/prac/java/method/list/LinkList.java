package com.arpit.prac.java.method.list;

import com.arpit.prac.java.method.recursion.ListNode;

import java.util.HashSet;

public class LinkList {

    //remove duplicate from unsorted list

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

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


        linkList.removeDuplicatesWithoutBuffer(head);

        while (null != head) {

            System.out.print(head.val + " -> ");

            head = head.next;

        }
    }

    private ListNode removeDuplicates(ListNode head) {

        HashSet set = new HashSet();


        set.add(head.val);
        while (null != head.next) {

            if (set.contains(head.next.val)) {
                head.next = head.next.next;

            } else {
                set.add(head.next.val);
                head = head.next;

            }

        }


        return head;
    }


    public void removeDuplicatesWithoutBuffer(ListNode head) {

        ListNode current_node = head;
        ListNode previous_node = head;
        ListNode runner = head;

        ListNode temp;

        while (current_node != null) {
            runner = head;
            while (runner != current_node) {

                if (current_node.val == runner.val) {
                    temp = current_node.next;
                    previous_node.next = temp;
                    current_node = temp;
                    break;
                }
                runner = runner.next;

            }


            if (current_node == runner) {
                previous_node = current_node;
                current_node = current_node.next;
            }

        }


    }
}

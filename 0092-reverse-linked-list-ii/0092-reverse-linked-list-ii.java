/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)
            return head;
        
        ListNode leftNode = head;
        ListNode first = null;

        while(left != 1)
        {
            first = leftNode;
            leftNode = leftNode.next;
            left--;
        }

        ListNode rightNode = head;

        while(right != 1)
        {
            rightNode = rightNode.next;
            right--;
        }

        ListNode last = rightNode.next;

        ListNode prevPrev = null;
        ListNode prev = null;
        ListNode curr = leftNode;

        while(curr != last)
        {
            prev = curr;
            curr = curr.next;
            prev.next = prevPrev;
            prevPrev = prev;
        }

        if(first != null)
            first.next = prev;
        else
            head = prev;

        leftNode.next = last;

        return head;
    }
}
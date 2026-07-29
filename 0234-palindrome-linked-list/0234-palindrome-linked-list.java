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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode head1 = null;
        while(temp != null)
        {
            ListNode newNode = new ListNode();
            newNode.val = temp.val;
            newNode.next = head1;
            head1 = newNode;
            temp = temp.next;
        }

        while(head != null)
        {
            if(head.val != head1.val)
            {
                return false;
            }
            head = head.next;
            head1 = head1.next;
        }
        return true;
    }
}
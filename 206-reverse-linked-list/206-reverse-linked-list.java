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
    public ListNode reverseList(ListNode head) {
         ListNode newHead = null;// initialised the dummy node to null
        // assigned dummy node to new head
        while(head != null){// iterate till the head was'nt reaching null
            ListNode next = head.next;// pointing it to the next step
            head.next = newHead;// broke the next pointer of head and pointed it to the dummy node
            newHead = head;// move dummy node to head
            head = next;// move the head to next
        }
        return newHead;
    }
}
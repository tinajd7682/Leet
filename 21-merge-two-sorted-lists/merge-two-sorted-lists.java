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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

        ListNode head = new ListNode(0);
        ListNode current = head;


         while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;   // Pick from list1
                list1 = list1.next;     // Move list1 forward
            } else {
                current.next = list2;   // Pick from list2
                list2 = list2.next;     // Move list2 forward
            }

            current = current.next;     // Move result forward
        }

        // Attach remaining nodes
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return head.next;  // Skip dummy, return real result
    }
}
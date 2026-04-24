class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);  // Placeholder
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = (l1 != null) ? l1.val : 0;  // Get value or 0
            int val2 = (l2 != null) ? l2.val : 0;

            int total = val1 + val2 + carry;  // Add digits + carry
            carry = total / 10;               // Carry is 1 if total >= 10
            int digit = total % 10;           // Actual digit to store

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
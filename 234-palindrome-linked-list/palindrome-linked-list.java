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
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode newhead = reverseList(slow);
        ListNode first = head;
        ListNode second = newhead;
        boolean result = true;
        while (second != null) {
            if (first.val != second.val) {
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(newhead);
        return result;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
}
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
    public ListNode reverseList(ListNode head){
        if(head == null || head.next ==null)return head;
        ListNode reversehead = reverseList(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return reversehead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode slow = head, fast = head.next;
        
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        secondHalf = reverseList(secondHalf);
        while(head != null && secondHalf != null){
            if(head.val != secondHalf.val)return false;
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}
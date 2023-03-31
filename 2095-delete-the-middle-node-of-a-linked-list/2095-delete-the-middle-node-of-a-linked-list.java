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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null;
        ListNode slow = head, fast = head.next.next,prev = new ListNode(-1);
        prev.next = slow;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            prev = prev.next;
        }
        System.out.print(prev.val+" "+slow.val);
        slow.next = slow.next.next;
        // prev.next = slow.next;
        return head;
    }
}
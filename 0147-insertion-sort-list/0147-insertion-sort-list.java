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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)return head;
        
        ListNode newHead = insertionSortList(head.next);
        if(head.val < newHead.val){
            head.next = newHead;
            return head;
        } else{
            // find the correct position of current head
            ListNode currentHead = newHead;
            while(currentHead.next != null){
                if(currentHead.next.val > head.val){
                    head.next = currentHead.next;
                    currentHead.next = head;
                    break;
                }
                currentHead = currentHead.next;
            }
            if(currentHead.next == null){
                currentHead.next = head;
                head.next = null;
            }
            return newHead;
        }
    }
}
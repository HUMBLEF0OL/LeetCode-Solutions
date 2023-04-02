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
        if(head == null || head.next == null)return head;
        
        ListNode reverseHead = reverseList(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return reverseHead;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || (left == right) || (left <=0) || (right <=0))return head;
        ListNode temp = head, prev = new ListNode(-1),reverseHead = null, rest = null;
        int position = 1;
        while(temp != null){
            if(position == left){
                prev.next = null;
                reverseHead = temp;
            }
            if(position == right){
                rest = temp.next;
                temp.next = null;
                break;
            }
            if(position < left)prev = temp;
            position++;
            temp = temp.next;
        }
        reverseHead = reverseList(reverseHead);
        
        temp = reverseHead;
        while(temp !=null && temp.next!=null){
            temp =temp.next;
        }
        if(prev.val == -1)head = reverseHead; 
        else prev.next = reverseHead;
        if(temp !=null)temp.next = rest;
        
        return head;
    }
}
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
    public String helperFunction(ListNode head){
            if(head == null) return "";
            String recursiveResult = helperFunction(head.next);
            return String.valueOf(head.val)+recursiveResult;
        }
    public int getDecimalValue(ListNode head) {
        
        String str = helperFunction(head);
        return Integer.parseInt(str,2);
    }
}
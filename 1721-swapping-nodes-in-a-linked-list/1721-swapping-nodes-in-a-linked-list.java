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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode startPointer = head,endPointer = head,current = head;
        int counter = 1;
        while(current!=null){
            if(counter<k)startPointer = startPointer.next;
            if(counter>k)endPointer = endPointer.next;
            counter++;
            current = current.next;
        }
        int tempValue = startPointer.val;
        startPointer.val = endPointer.val;
        endPointer.val = tempValue;
        return head;
    }
}
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
    public int listLength(ListNode head){
        if(head == null)return 0;
        return 1+ listLength(head.next);
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode output[] = new ListNode[k];
        
        ListNode temp = head,prev = null;
        int length = listLength(head);
        temp = head;
        int addOns = length % k;
        int baseSize = length/k;
        for(int i =0;i<k && temp!=null;i++){
            output[i] = temp;
            for(int j =1;j<=baseSize;j++){
                prev = temp;
                temp =temp.next;
            }
            if(addOns!=0){
                prev = temp;
                temp = temp.next;
                --addOns;
            }
            prev.next = null;
        }
        return output;
    }
}
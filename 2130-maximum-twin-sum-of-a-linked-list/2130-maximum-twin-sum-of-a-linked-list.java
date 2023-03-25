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
    public static int findLength(ListNode head){
        if(head == null)return 0;
        return 1+findLength(head.next);
    }
    public static int findTwinValue(ListNode head, int twinIndex){
        ListNode temp = head;
        int i=0;
        while(temp!=null){
            if(i == twinIndex)return temp.val;
            temp = temp.next;
            i++;
        }
        return 0;
    }
    public int pairSum(ListNode head) {
        int result = Integer.MIN_VALUE;
        ListNode temp = head;
        /* find the length of the list */
        int length = findLength(head);
        int i =0;
        int arr[] = new int[length];
        while(temp!=null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        
        
        temp = head;
        i =0;
        while(temp!=null){
            /* primary check for the current node */
            if(i<= (length/2-1)){
                /* find the twin */
                int twinIndex = length-1-i;
                int currentTwinSum = arr[twinIndex]+temp.val;
                result = Math.max(result,currentTwinSum);
            } else break;
            i++;
            temp = temp.next;
        }
        return result;
    }
}
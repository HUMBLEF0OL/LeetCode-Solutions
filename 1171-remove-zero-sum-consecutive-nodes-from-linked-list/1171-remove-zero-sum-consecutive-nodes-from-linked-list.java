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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        HashMap<Integer, ListNode> sumMap = new HashMap<>();
        sumMap.put(0,dummy);
        
        // calculating the sum
        int prefixSum = 0;
        for(ListNode i = dummy;i !=null;i = i.next){
            prefixSum += i.val;
            sumMap.put(prefixSum,i);
        }
        
        // now updating the pointers
        prefixSum = 0;
        for(ListNode i = dummy;i !=null;i=i.next){
            prefixSum += i.val;
            i.next = sumMap.get(prefixSum).next;
        }
        return dummy.next;
    }
}
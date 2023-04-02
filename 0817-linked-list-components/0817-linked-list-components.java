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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        boolean flag = false;
        int counter = 0;
        while(head!=null){
            while(head!=null && set.contains(head.val)){
                flag = true;
                head = head.next;
            }
            if(flag == true){
                counter++;
                flag = false;
            }
            if(head!=null) head = head.next;
        }
        return counter;
    }
}
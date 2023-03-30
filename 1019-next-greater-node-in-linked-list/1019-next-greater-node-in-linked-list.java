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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int output[] = new int[list.size()];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<list.size();i++){
            while(!st.isEmpty() && list.get(st.peek())<list.get(i)){
                output[st.pop()] = list.get(i);
            }
            st.push(i);
        }
        return output;
    }
}
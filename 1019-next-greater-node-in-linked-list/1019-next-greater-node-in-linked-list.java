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
    public static int findNextLargeNode(ListNode node, int val){
        int nodeVal = 0;
        while(node != null) {
            if(node.val > val) {
                nodeVal = node.val;
                break;
            }
            node = node.next;
        }
        return nodeVal;
    }
    public static int listLength(ListNode node) {
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
    public int[] nextLargerNodes(ListNode head) {
        int[] arr = new int[listLength(head)];
        int i = 0;
        while(head != null) {
            arr[i++] = findNextLargeNode(head, head.val);
            head = head.next;
        }
        return arr;
    }
    
}
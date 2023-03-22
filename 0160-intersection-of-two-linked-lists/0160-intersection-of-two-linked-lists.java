/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // pushing all the data of listA in HashMap
        HashSet<ListNode> set = new HashSet<>();
        while(headA!=null)
        {
            set.add(headA);
            headA = headA.next;
        }
        // traversing listB
        while(headB!=null)
        {
            if(set.contains(headB))return headB;
            headB = headB.next;
        }
        return null;
    }
}
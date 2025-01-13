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

         if (headA == null || headB == null) {
            return null;
        }

    int lenA=countNodes(headA);
    int lenB=countNodes(headB);

    while(lenA > lenB){
         headA=headA.next;
        lenA--;
       
    }    
    while(lenB > lenA){
         headB=headB.next;
        lenB--;
       
    }

    while(headA != null && headB != null && headA != headB){
        headA=headA.next;
        headB=headB.next;
    }
    return headA;
    }

public static int countNodes(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
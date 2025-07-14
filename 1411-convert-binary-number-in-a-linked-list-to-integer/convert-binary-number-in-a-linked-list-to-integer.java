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
    public int getDecimalValue(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(head!=null){
            head = head.next;
            n++;
        }
        int sum = 0;
    
        while(cur!=null){
            sum = sum + cur.val*(int)(Math.pow(2,n-1));
            n--;
            cur = cur.next;
        }
        return sum;
    }
}
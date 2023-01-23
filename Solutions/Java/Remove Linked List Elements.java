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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev=dummy;
        while(head!=null){
            if(head.val!=val){
                prev.next=head;
                prev=prev.next;
            }
            head=head.next;
        }
        prev.next=null;
        return dummy.next;
    }
}

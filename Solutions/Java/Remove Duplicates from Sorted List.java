class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode point = head;
        while(point!=null){
            while(point.next!=null && point.val==point.next.val){
                point.next=point.next.next;
                
            }
            point=point.next;
        }
        return head;
    }
}

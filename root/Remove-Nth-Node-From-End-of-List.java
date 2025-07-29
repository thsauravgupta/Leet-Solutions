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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum=new ListNode(1);
        dum.next=head;
        ListNode fp=dum;
        ListNode sp=dum;
        for(int i=0;i<=n;i++){
            fp=fp.next;
        }
        if(fp==null) return head.next;
        while(fp!=null){
            fp=fp.next;
            sp=sp.next;
        }
        ListNode del=sp.next;
        sp.next=sp.next.next;
        del=null;
        return dum.next;

    }
}
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
    public ListNode reverse(ListNode head){
        if(head==null)return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode KthNode(ListNode temp, int k) {
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;

        while (temp != null) {
            ListNode kth = KthNode(temp, k);
            if (kth == null) break;

            ListNode nextGroupHead = kth.next;
            kth.next = null;

            ListNode reversedHead = reverse(temp);
            prev.next = reversedHead;

            temp.next = nextGroupHead;
            prev = temp;
            temp = nextGroupHead;
        }

        return dummy.next;
    }
}
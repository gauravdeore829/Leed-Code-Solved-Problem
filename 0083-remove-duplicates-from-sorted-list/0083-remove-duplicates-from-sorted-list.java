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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        HashSet<Integer> ch=new HashSet();
        ch.add(head.val);
        ListNode temp=head;
        
        while(temp.next!=null){
            if(ch.contains(temp.next.val)){
                temp.next=temp.next.next;
            }else{
                ch.add(temp.next.val);
                temp=temp.next;
            }
    }
    return head;
    }
}
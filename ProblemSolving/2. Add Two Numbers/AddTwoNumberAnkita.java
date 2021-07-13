package com.udemy.linkedlist.interview;
 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class AddTwoNumberAnkita {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        ListNode head = null;
        ListNode temp = head;
        int carryFwd =0;
        
        while(l1 != null || l2 != null){
            
            int sum = 0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carryFwd;
            carryFwd = sum/10;
            sum = sum%10;
            
            if(head == null){
                head = new ListNode(sum);
                temp = head;
            }
            else{
                ListNode res = new ListNode(sum);
                res.next = null;
                temp.next = res;
                temp = res;
            }
            
        }
        if(carryFwd >0){
            ListNode res = new ListNode(carryFwd);
            res.next = null;
            temp.next = res;
        }
        return head;
    }
}
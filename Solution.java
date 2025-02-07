class ListNode {
int val;
  ListNode next;
  ListNode (int val){
  this.val = val;
  }
  ListNode (int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {

private static boolean hasCycle(ListNode l1) {
  ListNode slow = l1;
  ListNode fast = l1;
  while(fast!=null && fast.next!=null){
  slow = slow.next;
  fast = fast.next.next;
  if(slow == fast) return true;
    
}
return false;
}
  
public static void main(String[] manu) {
        ListNode l1 = new ListNode(3,new ListNode(2,new ListNode(0,new ListNode(-4))));
        l1.next.next.next.next = l1.next;
        System.out.println(hasCycle(l1));
}
}

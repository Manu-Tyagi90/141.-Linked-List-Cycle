class ListNode {
int val;
ListNode next;
ListNode (int x, ListNode y) {
val = x;
next = y;
}
} 

public class Practice1{
public static boolean detectCycle(ListNode l1) {
if(l1==null || l1.next == null) return false;
ListNode slow = l1;
ListNode fast = l1;
while(fast!=null && fast.next !=null) {
slow = slow.next;
fast = fast.next.next;
if(fast == slow) return true; 
}
return false;
}
}

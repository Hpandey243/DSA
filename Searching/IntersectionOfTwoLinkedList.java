// Problem : https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/

public class Solution {
    public ListNode getIntersectionNode(ListNode headB, ListNode headA) {
        Set<ListNode> dataA=new HashSet<>();
        while(headA!=null){
            dataA.add(headA);
            headA=headA.next;            
        }
        while(headB!=null){             
            if(dataA.contains(headB)) return headB;     
            headB=headB.next;            
        }
        return null;       
    }
}

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/10/23
 * Time: 上午10:38
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)return null;
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null && headB != null){
            if (!set.add(headA))return headA;
            if (!set.add(headB))return headB;
            headA = headA.next;
            headB = headB.next;
        }
        while (headA != null){
            if (!set.add(headA))return headA;
            headA = headA.next;
        }
        while (headB != null){
            if (!set.add(headB))return headB;
            headB = headB.next;
        }
        return null;
    }
}

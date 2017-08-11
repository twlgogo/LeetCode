import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/11
 * Time: 10:15
 */
public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode currNode = head;
        while (currNode != null){
            while(currNode.next!=null&&currNode.val == currNode.next.val)
                    currNode.next = currNode.next.next;
            currNode = currNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        node1.next = node2; node2.next = node3;
        node1 = deleteDuplicates(node1);
    }
}

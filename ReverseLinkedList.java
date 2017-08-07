import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 10:53
 * 链表的反转问题
 * 对每个节点做如下操作：
 * 保存它的下个节点 、 将它的下个节点指向刚才保存的上个节点、将上个节点变为当前节点、调到下个节点
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n1,n2,n3;
        n1 = new ListNode(1);
        n2 = new ListNode(2);
        n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode result = reverseList(n1);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}

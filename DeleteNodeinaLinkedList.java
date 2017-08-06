/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 12:41
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

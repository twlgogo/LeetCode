import DataStructure.ListNode;
import DataStructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/30
 * Time: 2:34 PM
 */
public class T109SortedListToBST {
  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode next = slow.next;
    slow.next = null;
    TreeNode root = new TreeNode(slow.val);
    root.left = sortedListToBST(head);
    root.right = sortedListToBST(next);
    slow.next = next;
    return root;
  }
}

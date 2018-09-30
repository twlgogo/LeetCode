
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import DataStructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/27
 * Time: 9:08 AM
 */
public class T94InorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> resList = new ArrayList<>();
    if (root == null) return resList;
    travelHelper(root,resList);
    return resList;
  }

  private void travelHelper(TreeNode root, List<Integer> resList) {
    if (root == null) return;
    travelHelper(root.left,resList);
    resList.add(root.val);
    travelHelper(root.right,resList);
  }

  private void travelHelper2(TreeNode root, List<Integer> resList) {
    if (root == null) return;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curNode = root;
    while (curNode != null || !stack.isEmpty()) {
      while (curNode != null) {
        stack.push(curNode);
        curNode = curNode.left;
      }
      if (!stack.isEmpty()) {
        curNode = stack.pop();
        resList.add(curNode.val);
        curNode = curNode.right;
      }
    }
  }
}

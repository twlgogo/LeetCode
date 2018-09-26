/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 下午2:23
 */
public class T814PruneTree {
  public TreeNode pruneTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    root.left = pruneTree(root.left);
    root.right = pruneTree(root.right);
    return (root.val == 1|| root.left != null || root.right != null)  ? root : null;
  }
}

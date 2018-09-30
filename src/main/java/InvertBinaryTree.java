
import sun.reflect.generics.tree.Tree;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/1
 * Time: 10:17
 */


public class InvertBinaryTree {
    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x;}
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null)return null;
        TreeNode tempNode =  root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);
        return root;
    }
}

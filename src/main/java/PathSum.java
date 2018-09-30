import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/28
 * Time: 10:52
 */
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null )return false;
        if (root.left == null && root.right == null && sum -root.val==0)return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        TreeNode node = new TreeNode(1);
        System.out.println(hasPathSum(node,1));
    }
}

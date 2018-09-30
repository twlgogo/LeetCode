import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/30
 * Time: 11:41
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left==0||right==0)?left+right+1:Math.min(left,right)+1;
    }
}

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 10:11
 */
public class DiameterofBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)return 0;
        travelForDeepth(root);
        return max;
    }
    private int travelForDeepth(TreeNode root){
        if (root == null)return 0;
        int left = travelForDeepth(root.left);
        int right = travelForDeepth(root.right);
        max = Math.max(left+right,max);
        return Math.max(left,right)+1;
    }
}

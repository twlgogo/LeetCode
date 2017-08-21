/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/17
 * Time: 19:40
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        int lLength = getTreeLength(root.left);
        int rLength = getTreeLength(root.right);
        return Math.abs(lLength-rLength)<=1 && left && right;
    }

    private int getTreeLength(TreeNode node){
        if (node == null)return 0;
        return Math.max(getTreeLength(node.left),getTreeLength(node.right))+1;
    }
}

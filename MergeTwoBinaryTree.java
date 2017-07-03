/**
 * Created by ttwl on 2017/6/29.
 */
public class MergeTwoBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null){return null;}
        TreeNode resultTreeNode = new TreeNode(-1);
        if (t1 == null){
            resultTreeNode.val = t2.val;
            resultTreeNode.left=mergeTrees(null,t2.left);
            resultTreeNode.right=mergeTrees(null,t2.right);
        }else if (t2 == null ){
            resultTreeNode.val = t1.val;
            resultTreeNode.left=mergeTrees(t1.left,null);
            resultTreeNode.right=mergeTrees(t1.right,null);
        }else{
            resultTreeNode.val = t1.val + t2.val;
            resultTreeNode.left=mergeTrees(t1.left,t2.left);
            resultTreeNode.right = mergeTrees(t1.right,t2.right);
        }
        return resultTreeNode;
    }

}

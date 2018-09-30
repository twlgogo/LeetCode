import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 14:00
 * 在BST（二叉搜索树）中找两个叶节点的共同祖先，会比较好找
 * 他们的共同祖先的值一定是比其中一个节点的大，比另外的一个节点的小
 * 可以采用递归的方式和非递归的方式进行查找
 * 同时非递归的算法也比较容易理解
 */
public class LowestCommonAncestorofaBinarySearchTree {
    //递归方法解决
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val>p.val && root.val>q.val)return lowestCommonAncestor(root.left,p,q);
        else if (root.val<p.val && root.val<q.val)return lowestCommonAncestor(root.right,p,q);
        else return root;
    }

    //非递归方法
    public TreeNode lowestCommonAncestorUnrecursion(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val-p.val)*(root.val-q.val) >0 )
            root = root.val>p.val?root.left:root.right;
        return root;
    }
}

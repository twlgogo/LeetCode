import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 15:46
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)return true;
        else return symmetricHelper(root.left,root.right);
       // return root == null||symmetricHelper(root.left,root.right); 标准写法
    }

    private boolean symmetricHelper(TreeNode p,TreeNode q){
        if (p == null&& q==null)return true;
        else if (p==null)return false;
        else if (q==null)return false;
        boolean left = symmetricHelper(p.left,q.right);
        boolean right = symmetricHelper(p.right,q.left);
        return (p.val==q.val)&&left&&right;
    }
}

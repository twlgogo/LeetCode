import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 12:47
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)return true;
        if ((p==null&&q!=null)||(p!=null&&q==null))return false; //if(p==null||q==null)return false;可以这样判断
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        if (p.val == q.val)return left&&right&&true;//return p.val == q.val &&left&&right;
        else return false;
    }

}

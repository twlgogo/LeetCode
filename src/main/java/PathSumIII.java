import DataStructure.TreeNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 16:00
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)return 0;
        return findPath(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);

    }
    private int findPath(TreeNode root,int sum){
        if (root == null)return 0;
        int left = findPath(root.left,sum-root.val);
        int right = findPath(root.right,sum-root.val);
        return (root.val == sum?1:0)+left+right;
    }
}

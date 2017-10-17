/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/10/17
 * Time: 下午3:37
 */
public class LongestUnivaluePath {
    int ans;                //使用全局变量进行保存最终的结果
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    private int arrowLength(TreeNode node){
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0 , arrowRight = 0;
        if (node.left != null && node.left.val == node.val){
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val){
            arrowRight += right + 1;
        }
        ans = Math.max(ans,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);
    }
}

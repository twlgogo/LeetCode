import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 10:14
 *
 * 递归遍历二叉树啊，一定要熟练掌握
 * 层序遍历，先序遍历，后序遍历
 */
public class BinaryTreeTilt {
    public int findTiltWrong(TreeNode root) {
        if(root == null || root.left==null&&root.right==null)return 0;
        int result = 0,sumofLeft = 0,sumofRight = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if (curr.left == null && curr.right == null) ;
            if (curr.left == null && curr.right != null) {
                result += curr.right.val;
                queue.offer(curr.right);
            }
            if (curr.left != null && curr.right == null) {
                result += curr.left.val;
                queue.offer(curr.left);
            }
            if (curr.left != null && curr.right != null) {
                result += Math.abs(curr.left.val - curr.right.val);
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        return result;
    }
    int result = 0;
    public int findTilt(TreeNode root) {
        postTravelTree(root);
        return result;
    }
    private int postTravelTree(TreeNode root){
        if (root==null)return 0;
        int left = postTravelTree(root.left);
        int right = postTravelTree(root.right);
        result += Math.abs(left-right);
        return left+right+root.val;
    }

    public static void main(String[] args) {

    }
}

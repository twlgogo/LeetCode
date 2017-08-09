/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 10:41
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode resTree = buildHelper(nums,0,nums.length-1);
        return resTree;
    }
    private TreeNode buildHelper (int []nums,int low, int high){
        if (low > high )return null;
        int mid = (low + high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildHelper(nums,low,mid-1);
        node.right = buildHelper(nums,mid+1,high);
        return node;
    }
}

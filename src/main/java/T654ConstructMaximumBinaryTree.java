import DataStructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 上午11:49
 */
public class T654ConstructMaximumBinaryTree {
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    if (nums == null || nums.length == 0){
      return null;
    }
    return constructHelper(nums, 0, nums.length - 1);

  }

  private TreeNode constructHelper(int[] nums, int begin, int end) {
    if (begin > end) {
      return null;
    }
    if (begin == end) {
      return new TreeNode(nums[begin]);
    }
    int max = Integer.MIN_VALUE;
    int index = 0;
    for (int i = begin; i <= end; i++) {
      if (max < nums[i]) {
        max = nums[i];
        index = i;
      }
    }
    TreeNode curNode = new TreeNode(max);
    curNode.left = constructHelper(nums,begin,index - 1);
    curNode.right = constructHelper(nums,index + 1,end);
    return curNode;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,1,6,0,5};
    new T654ConstructMaximumBinaryTree().constructMaximumBinaryTree(nums);
  }
}

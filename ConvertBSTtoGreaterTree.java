public class ConvertBSTtoGreaterTree {
    int sum = 0;
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    public void convert(TreeNode root){
        if (root == null)return;
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}

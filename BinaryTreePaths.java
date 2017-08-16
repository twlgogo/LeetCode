import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/16
 * Time: 9:35
 */
public class BinaryTreePaths {
    public List<String> list = new LinkedList<>();
    String tempStr = "";
    public List<String> binaryTreePathsWrong(TreeNode root) {
        if (root == null)return list;
        if (root.left==null&&root.right==null){
            tempStr += root.val+"";
            list.add(tempStr);
            tempStr = "";
        }else {
            tempStr += root.val+"->";
            if (root.left!=null)binaryTreePathsWrong(root.left);
            if (root.right!=null)binaryTreePathsWrong(root.right);
        }
        return list;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if (root != null)searchTree(root,"",list);
        return list;
    }
    private void searchTree(TreeNode root,String currPath,List<String> list){
        if (root.left==null&&root.right==null){
            list.add(currPath+root.val+"");
        }
        if (root.left != null)searchTree(root.left,currPath+root.val+"->",list);
        if (root.right != null)searchTree(root.right,currPath+root.val+"->",list);
    }
}

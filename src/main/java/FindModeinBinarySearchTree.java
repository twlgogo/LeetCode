
import DataStructure.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/16
 * Time: 16:35
 */
public class FindModeinBinarySearchTree {
    private HashMap<Integer,Integer> map = new HashMap<>();
    int maxCount = 0;
    public int[] findMode(TreeNode root) {
        if (root==null)return new int[0];
        inorder(root);
        List<Integer> list = new LinkedList<>();
        for (int key:map.keySet()){
            if (map.get(key)==maxCount)list.add(key);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i <result.length ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    private void inorder(TreeNode node){
        if (node.left!=null)inorder(node.left);
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        maxCount = Math.max(maxCount,map.get(node.val));
        if (node.right!=null)inorder(node.right);
    }
}

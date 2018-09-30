
import DataStructure.TreeNode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/26
 * Time: 14:55
 * 并不简单的二分查找的写法，看似简单，但是很容易把边界条件写错，牢记不要眼高手低
 */
public class TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        bfs(root,set);
        int []vals = new int[set.size()];
        int index = 0;
        for (int i:set) {
            vals[index++] = i;
        }
        Arrays.sort(vals);
        int i = 0,j=vals.length-1;
        while(i!=j){
            if (vals[i]+vals[j]==k)return true;
            if (vals[i]+vals[j]<k){i++;continue;}
            if (vals[i]+vals[j]>k){j--;continue;}
        }
        return false;
    }
    private void bfs(TreeNode root,HashSet<Integer> set){
        if (root == null)return;
        bfs(root.left,set);
        set.add(root.val);
        bfs(root.right,set);
    }
}

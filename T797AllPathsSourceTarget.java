import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 下午9:10
 */
public class T797AllPathsSourceTarget {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    if (graph == null || graph.length == 0 || graph[0] == null || graph[0].length == 0) return null;
    List<List<Integer>> resList = new ArrayList<>();
    findHelper(graph,0,new ArrayList<>(),resList);
    return resList;
  }

  public void findHelper(int[][] graph,int curNode,List<Integer> curPath,List<List<Integer>> resList) {
    curPath.add(curNode);
    if (curNode == graph.length - 1) {
      resList.add(new ArrayList<>(curPath));
    } else {
      for (int node:graph[curNode]) {
        findHelper(graph,node,curPath,resList);
      }
    }
    curPath.remove(curPath.size() - 1);
  }
}

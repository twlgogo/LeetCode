/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/25
 * Time: 下午11:26
 */
public class T807KeepingSkyline {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
      return 0;
    }
    int[] maxLeft = new int[grid.length];
    int[] maxBottom = new int[grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      int max = 0;
      for (int j = 0; j < grid[i].length; j++) {
        if (max < grid[i][j]) {
          max = grid[i][j];
        }
      }
      maxLeft[i] = max;
    }
    for (int i = 0; i < grid[0].length; i++) {
      int max = 0;
      for (int j = 0; j < grid.length; j++) {
        if (max < grid[j][i]) {
          max = grid[j][i];
        }
      }
      maxBottom[i] = max;
    }
    int count = 0;
    for (int i = 0; i < grid.length ; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        int maxHight = maxLeft[i] < maxBottom[j] ? maxLeft[i] : maxBottom[j];
        count += maxHight - grid[i][j];
      }
    }
    return count;
  }
}

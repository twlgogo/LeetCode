
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/29
 * Time: 12:31 PM
 */
public class T48Rotate {
  public void rotate(int[][] matrix) {
    // 判断矩阵是否为空或是否为方阵
    if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0
            || matrix.length != matrix[0].length) return;

    int n = matrix.length - 1;
    //matrix[i][j] = matrix[n - j][i]
    for (int i = 0; i <= n / 2; i++) {
      for (int j = i; j < n - i; j++) {
        int t = matrix[i][j];
        matrix[i][j] = matrix[n - j][i];
        matrix[n - j][i] = matrix[n - i][n - j];
        matrix[n - i][n - j] = matrix[j][n - i];
        matrix[j][n - i] = t;
      }
    }

  }
}

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 上午12:21
 */
public class T59GenerateMatrix {
  static int count = 1;
  public static int[][] generateMatrix(int n) {
    if (n <= 0)return null;
    int [][] resMatrrix = new int[n][n];
    if (n == 1) {
      resMatrrix[0][0] = 1;
      return resMatrrix;
    }
    printCore(resMatrrix,0,n -1,0,n-1);
    return resMatrrix;
  }

  private static void printCore(int[][] matrix,int startCol, int endCol, int startRow, int endRow) {
    if (startCol < endCol && startRow < endRow) {
      for (int i = startCol; i <= endCol - 1 ; i++) {
        matrix[startRow][i] = count++;
      }
      for (int i = startRow; i <= endRow - 1; i++) {
        matrix[i][endCol] = count++;
      }
      for (int i = endCol ; i >= startCol + 1  ; i--) {
        matrix[endRow][i] = count++;
      }
      for (int i = endRow ; i >= startRow + 1  ; i--) {
        matrix[i][startCol] = count++;
      }
      printCore(matrix,startCol + 1, endCol - 1, startRow + 1 ,endRow - 1);
    }
    if (startCol == endCol && startRow == endRow) {
      matrix[startCol][startRow] = count ++;
    }
  }

  public static void main(String[] args) {
    int[][] res = generateMatrix(3);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(res[i][j]);
      }
    }
    //System.out.println(Arrays.toString(res));
  }
}

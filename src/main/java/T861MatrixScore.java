
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 上午10:58
 */
public class T861MatrixScore {
  public int matrixScore(int[][] A) {
    if (A == null || A.length == 0 || A[0] == null || A[0].length == 0) {
      return 0;
    }
    int m = A.length;
    int n = A[0].length;
    for (int i = 0; i < m ; i++) {
      if (A[i][0] == 0) {
        togging(A,true,i);
      }
    }
    for (int i = 1; i < n; i++) {
      int countOfZero = 0;
      for (int j = 0; j < m; j++) {
        if (A[j][i] == 0) {
          countOfZero++;
        }
      }
      if (countOfZero > m/2){
        togging(A,false,i);
      }
    }
    int res = 0;
    for (int i = 0; i < m ; i++) {
      res += countLine(A[i]);
    }
    return res;
  }

  private void togging(int[][] A, boolean isRow, int index){
    if (isRow) {
      for (int i = 0; i < A[0].length; i++) {
        A[index][i] = 1 - A[index][i];
      }
    } else {
      for (int i = 0; i < A.length; i++) {
        A[i][index] = 1- A[i][index];
      }
    }
  }

  private int countLine(int[] line) {
    int res = 0;
    for (int i = 0; i < line.length; i++) {
      int base = (int)Math.pow(2,line.length - 1 -i);
      res += base*line[i];
    }
    return res;
  }

  public static void main(String[] args) {
    int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
    T861MatrixScore tt = new T861MatrixScore();
    System.out.println(tt.matrixScore(A));
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(A[i][j]);
      }
      System.out.println();
    }
  }
}

import java.util.Arrays;

/**
 * Created by ttwl on 2017/7/7.
 */
public class ReshapetheMatrix {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row ,column;
        int[][] result = new int[r][c];
        row = nums.length;
        column = nums[0].length;
        if ((r*c) != (row *column)){
            return  nums;
        }
        int []numbers = new int[row * column];
        int index = 0;
        for (int i= 0 ; i < row ; i++ ){
            for (int j = 0; j < column; j++) {
                numbers[index++] = nums[i][j];
            }
        }
        index = 0;
        for (int i = 0;i< r;i++){
            for (int j = 0; j <c ; j++) {
                result[i][j] = numbers[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][]nums = {{1,2},{3,4}};
        int [][]result = matrixReshape(nums,1,4);
        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}

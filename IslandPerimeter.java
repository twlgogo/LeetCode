import java.util.Arrays;

/**
 * Created by ttwl on 2017/7/12.
 */
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int l = grid.length + 2;
        int w = grid[0].length+2;
        int result = 0;
        int [][]maskGird = new int[l][w];
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                maskGird[i+1][j+1] = grid[i][j];
            }
        }
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (maskGird[i+1][j+1] ==1){
                    result = result+4;
                    if (maskGird[i][j+1] == 1)result--;
                    if (maskGird[i+1][j] == 1)result--;
                    if (maskGird[i+2][j+1] == 1)result--;
                    if (maskGird[i+1][j+2] == 1)result--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //islandPerimeter();
        int [][]test = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int result = islandPerimeter(test);
        System.out.println(result);
//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <4 ; j++) {
//                System.out.print(test[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}

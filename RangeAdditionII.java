/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/2
 * Time: 17:12
 *知识点：怎么判断一个二维数组为空，同理判断一维数组为空只需要判断
 * 1.数组未初始化 2.数组已经初始化但是长度为0
 */
public class RangeAdditionII {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops==null||ops.length==0||(ops.length==1&&ops[0].length==0))return m*n;
        int prea = ops[0][0],preb = ops[0][1];
        int result = 0;
        for (int []op : ops){
            int a = op[0],b=op[1];
            if (a>m || b> n)return m*n;
            result = Math.min(a,prea)*Math.min(b,preb);
            prea = Math.min(a,prea);
            preb = Math.min(b,preb);
        }
        return result;
    }

    public static void main(String[] args) {
        int [][]ops = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};
        System.out.println(maxCount(3,3,ops));

    }
}

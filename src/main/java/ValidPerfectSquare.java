package src.main.java;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/16
 * Time: 12:29
 * 时刻注意使用int型的变量会不会溢出，溢出后变量的内容会变小
 * 第一种方法判断一个数是否超过最大值时，是不会生效的，转换成long型使用
 * 可以用二分查找的方式进一步降低时间复杂度
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        for (long i = 0; i <Integer.MAX_VALUE ; i++) {
            if (i*i==num)return true;
            if ((long)i*i>num)break;
        }
        return false;
    }
    public static boolean isPerfectSquare2(int num) {
        int low = 1 ,high = num;
        while (low<=high){
            long mid = (low+high)/2;   //同样存在溢出情况，比如判断整型最大值，会发生溢出
            if (mid*mid==num)return true;
            else if (mid*mid<num)low = (int)mid+1;
            else high = (int)mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}

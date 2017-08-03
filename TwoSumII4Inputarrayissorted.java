import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/3
 * Time: 16:27
 *
 * 数组是有序的，首先就应当考虑二分查找，从两端开始查找
 * 开始使用的遍历会出现超时错误
 */
public class TwoSumII4Inputarrayissorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length-1;
        int[] result = new int[2];
        while(left < right){
            if ((numbers[left]+numbers[right]) == target){
                result[0] = left +1;
                result[1] = right +1;
                break;
            }else if ((numbers[left]+numbers[right]) < target){left++;}
            else {right --;}
        }
        return result;
    }
    public static int[] twoSumWrong(int[] numbers, int target) {
        int []result = new int[2];
        for (int i = 0; i <numbers.length ; i++) {
            int add2 = target - numbers[i];
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[j]==add2){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []numbers = {-1,0};
        System.out.println(Arrays.toString(twoSum(numbers,-1)));
    }
}

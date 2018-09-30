
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 15:33
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n<=0)return 0;
        if (n==1)return 1;
        if (n==2)return 2;
        int twoStepstoResult = 1;
        int oneSteptoResult = 2;
        int result = 0;
        for (int i = 2; i <n ; i++) {
            result = twoStepstoResult+oneSteptoResult;
            twoStepstoResult = oneSteptoResult;
            oneSteptoResult =result;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(climbStairs(i));
        }

    }
}

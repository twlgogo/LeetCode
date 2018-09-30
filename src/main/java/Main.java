
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/19
 * Time: 下午8:32
 */
public class Main {
    public static void main(String[] args) {
        int []array = {2, 5 ,4};
        int ans;
        if ((array[1]-array[0])%2==0){
            ans = (array[1] - array[0])/2 + (array[2]-array[1]);
        }else {
            ans = (array[1]+1 - array[0])/2 + (array[2] - array[1]) + 1;
        }
        System.out.println(ans);
    }
}

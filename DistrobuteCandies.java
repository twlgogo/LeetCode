import java.util.Arrays;

/**
 * Created by ttwl on 2017/7/7.
 */
public class DistrobuteCandies {
    public static int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int index=1;    //     index--总共有多少种的糖果
        for (int i = 0; i <candies.length -1 ; i++) {
            if(candies[i] != candies[i+1]){
                ++index ;
            }
        }
        System.out.println(index);
        int flag = candies.length/2;    //flag - 每个人分到的糖果数
        if (flag >= index){return index;}
        else return flag;
    }

    public static void main(String[] args) {
        int []candies = {1,2,3,4,5,6};
        System.out.println(distributeCandies(candies));
    }
}

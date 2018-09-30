
/**
 * Created by ttwl on 2017/6/29.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int[] binX = toBinary(x);
        int[] binY = toBinary(y);
        int index = 0;
        for(int i = 0; i<binX.length||i<binY.length;i++){
           if (binX[i] != binY[i])index++;
        }

        return index;
    }

    public static int[] toBinary(int num){
        int[] result = new int[32];
        int index = 0;
        while (num != 0){
            result[index++] = num%2;
            num = num/2;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print(HammingDistance.hammingDistance(1,19));
    }
}

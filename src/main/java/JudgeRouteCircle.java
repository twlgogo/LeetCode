
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/26
 * Time: 14:45
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        if (moves == null||moves.length()==0)return true;
        int i =0 ,j =0;
        for (char s:moves.toCharArray()){
            switch (s){
                case 'U':
                    i++;break;
                case 'D':
                    i--;break;
                case 'L':
                    j++;break;
                case 'R':
                    j--;break;
            }
            if (i == 0 && j == 0)return true;
        }
        return false;
    }
}

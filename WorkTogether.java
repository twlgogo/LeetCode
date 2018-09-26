import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/5/11
 * Time: 下午7:57
 */
public class WorkTogether {

    public static void main(String[] args) {
        Boolean res = true;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        List<Set<Integer>> sets = new LinkedList<>();
        for (int i = 0; i < 2*n ; i++) {
            sets.add(new HashSet<>());
        }
        for (int i = 0; i < m ; i++) {
            String rareTemp =sc.nextLine();
            String[] temp = rareTemp.split(",");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            System.out.println(a + " "+ b);
            sets.get(a-1).add(b-1);
            sets.get(b-1).add(a-1);
        }
        for (int i = 0; i < n; i++) {
            Set curSet = sets.get(i);
            Object []temp = new Object[curSet.size()];
            int []checkNum = new int[curSet.size()];
            curSet.toArray(temp);
            for (int j = 0; j < curSet.size(); j++) {
                checkNum[j] = (int)temp[j];
            }
            for (int j = 0; j < curSet.size() ; j++) {
                for (int k = j+1; k < curSet.size() ; k++) {
                    if (Math.abs(checkNum[j] - checkNum[k])==1 && Math.max(checkNum[j],checkNum[i])/2==0){
                        res = false;
                    }
                }
            }
        }
        String result = res? "yes": "no";
        System.out.println(result);
    }
}

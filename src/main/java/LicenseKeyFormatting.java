
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/22
 * Time: 下午9:09
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        char []temp = S.toCharArray();
        char []clearChar = new char[S.length()];
        char []ans = new char[S.length()+ S.length()%K];
        for (int i = temp.length -1 ; i >=0 ; i--) {
            if (temp[i] != '-'){
                clearChar[temp.length-i-1] = temp[i];
            }
        }
        for (int i = 0 , index = 0; i <clearChar.length ; i++) {
            if (i != 0 && i%K ==0){
                ans[index] = '-';
            }
//            else if (clearChar[i]!='')
        }
        return "";
    }

    public static void main(String[] args) {
        char []ans = new char[1];

    }
}

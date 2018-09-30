
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 13:49
 */
public class StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        int numofL = 0,numofA = 0;
        for (int i = 0; i <s.length() ; i++) {
            switch (s.charAt(i)){
                case 'A':numofA++;numofL = 0;break;
                case 'L':numofL++;if (numofL==3)return false;break;
                case 'P':numofL = 0;break;
            }
        }
        return  !(numofA>1);
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPLALL"));
    }
}

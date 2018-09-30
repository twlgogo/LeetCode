
/**
 * Created by ttwl on 2017/7/3.
 */
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String []reasult = new String[words.length];
        int index = 0;
        int flag = -1;
        boolean issubString = true;
        String line1 = "qwertyuiop";
        char []line1Array = line1.toCharArray();
        String line2 = "asdfghjkl";
        char []line2Array = line1.toCharArray();
        String line3 = "zxcvbnm";
        char []line3Array = line1.toCharArray();
        for (String word : words){
            String lowerCaseWord =new String();
            lowerCaseWord = word.toLowerCase();
            char []wordArray = lowerCaseWord.toCharArray();
            String firstLat = lowerCaseWord.substring(0,0);
            if (line1.contains(firstLat)){flag = 1;}
            if (line2.contains(firstLat)){flag = 2;}
            if (line3.contains(firstLat)){flag = 3;}
            switch (flag){
                case 1:
                    for (char c :line1Array)
                        for (char a:wordArray)
                            if(a !=c) issubString = false;
                    break;
                case 2:
                    for (char c :line2Array)
                        for (char a:wordArray)
                            if(a !=c) issubString = false;
                    break;
                case 3:
                    for (char c :line3Array)
                        for (char a:wordArray)
                            if(a !=c) issubString = false;
                    break;
            }
            if (issubString){
                reasult[index++] = word;
            }

        }
        return reasult;

    }
    public static void main(String []argus){
        String []test = new String[100];
        test[0] = "sadaf";
        test[1] = "qewrw";
        test[2] = "zcxxczd";
        String []result  = KeyboardRow.findWords(test);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

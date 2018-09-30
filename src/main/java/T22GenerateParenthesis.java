
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 下午1:17
 */
public class T22GenerateParenthesis {
  public List<String> generateParenthesis(int n) {
    List<String> resList = new ArrayList<>();
    generateAll(resList,"",0,0,n);
    return resList;
  }

  private void generateAll(List<String> resList,String cur, int open,int close,int max) {
    if (cur.length() == max * 2 && validParenthesis(cur)) {
      resList.add(cur);
      return;
    }
    if (open < max) {
      generateAll(resList,cur+"(",open + 1,close,max);
    }
    if (close< max) {
      generateAll(resList,cur+")",open,close + 1,max);
    }
  }

  private boolean validParenthesis(String cur) {
    int balance = 0;
    for (char c:cur.toCharArray()) {
      if (c == '(') {
        balance++;
      }
      if (c == ')') {
        balance--;
      }
      if (balance < 0) {
        return false;
      }
    }
    return balance == 0;
  }
}

package src.main.java;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 11:28 AM
 */
public class T241DiffWaysToCompute {
  public List<Integer> diffWaysToCompute(String input) {
    List<Integer> res = new LinkedList<>();
    char ch;
    for (int i = 0; i < input.length() ; i++) {
      if ((ch = input.charAt(i)) == '-' || ch == '+' || ch == '*') {
        List<Integer> left = diffWaysToCompute(input.substring(0,i));
        List<Integer> right = diffWaysToCompute(input.substring(i+1,input.length()));
        for (int l: left) {
          for (int r:right) {
            int temp = 0;
            switch (ch) {
              case '+' :
                temp = l + r;
                break;
              case '-':
                temp = l - r;
                break;
              case '*':
                temp = l * r;
                break;
            }
            res.add(temp);
          }
        }
      }
    }
    if (res.size() == 0) {
      res.add(Integer.parseInt(input));
    }
    return res;
  }
}

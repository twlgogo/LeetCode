
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 9:24 PM
 */
public class T537ComplexNumberMultiply {
  public String complexNumberMultiply(String a, String b) {
    int []valA = getVal(a);
    int []valB = getVal(b);
    int real = valA[0] * valB[0] - valA[1] * valB[1];
    int image = valA[0] * valB[1] + valA[1] * valB[0];
    return real + "+" + image + "i";
  }

  private int[] getVal (String a) {
    String []str = a.split("\\+");
    int []val = new int[2];
    val[0] = Integer.parseInt(str[0]);
    val[1] = Integer.parseInt(str[1].substring(0,str[1].length() - 1));
    return val;
  }
}

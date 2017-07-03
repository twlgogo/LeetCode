import java.util.Date;
import java.util.Properties;

/**
 * Created by ttwl on 2017/6/30.
 */
public class FirstJavaTest {
    public static void main(String[] argus){
        System.out.println(new Date());
        Properties properties = System.getProperties();
        properties.list(System.out);
        System.out.println("Memory Usage: -----");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Menmory:"+runtime.totalMemory()
                +"Free Memory: "+runtime.freeMemory());
    }
}

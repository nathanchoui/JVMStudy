package JvmBase;

/**
 * -Xss256K
 *
 * Created by za-zhangwei002 on 2019/3/18.
 */
public class SimpleStackOverflowTest {

    private static int count = 0;

    public static void recursion() {
        count ++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("count: " + count);
            e.printStackTrace();
        }
    }
}

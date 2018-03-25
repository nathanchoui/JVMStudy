package JvmBase;

/**
 * Description:  -XX:+PrintGCDetails
 * <p>
 * Created by nathan.z on 2018/3/26.
 */
public class JVMStackOomTest {

    private int count = 0;

    public void recursion() {
        count ++;
        recursion();
    }

    public void testRecursion() {
        try {
            recursion();
        }
        catch (Throwable e) {
            System.out.println("deep of stack is " + count);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JVMStackOomTest ts = new JVMStackOomTest();
        ts.testRecursion();
    }
}

package JvmBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/17.
 */
public class StringOomMock {

    // -XX:PermSize=8m XX:MaxPermSize=8m
    /**
     * 在1.8下 PermSize 和 MaxPermSize 虚拟机参数会提示被忽视，证明PermGen（永久代已经被删除）
     *
     * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
     *
     *
     */
    static String  base = "string";
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            for (int i=0;i< Integer.MAX_VALUE;i++){
                String str = base + base;
                base = str;
                list.add(str.intern());
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

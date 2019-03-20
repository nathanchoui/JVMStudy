package JvmBase;

/**
 * -Xmx20m -Xms20m -Xmn2m -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * Created by za-zhangwei002 on 2019/3/19.
 */
public class NewSizeDemo {

    public static void main(String[] args) {
        byte[] b = null;
        for (int i=0; i < 10; i ++) {
            b = new byte[1024 * 1024];
        }
    }
}

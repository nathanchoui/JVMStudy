package JvmBase;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/14.
 */
public class StringIntern {

    public static void main(String[] args) {
        String a = new String("1");
        String b = "1";
        // false
        System.out.println("a == b :" + (a == b));

        String c = new String("2");
        c.intern();
        String d = "2";
        // false
        System.out.println("c == d :" + (c == d));

        String e = new String("2") + new String("2");
        e.intern();
        String f = "22";
        // true
        System.out.println("e == f :" + (e == f));
    }
}

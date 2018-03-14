package JvmBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/14.
 */
public class MemoryLeak {

    public static class Key {
        private Integer id;

        public Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        while (true) {
            for (int i = 0; i < 1000000; i ++) {
                if (!m.containsKey(new Key(i))) {
                    m.put(new Key(i), "Number:" + i);
                }
            }
            System.out.println("m.emory: " + Runtime.getRuntime().freeMemory() / 1024 / 1024 + " / " + Runtime.getRuntime().totalMemory() / 1024 / 1024);
        }
    }
}

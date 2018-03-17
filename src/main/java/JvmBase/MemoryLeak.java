package JvmBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/14.
 */
public class MemoryLeak {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        int i = 0 ;
        boolean flag = true;
        while(flag){
            try {
                i++;
                list.add(new byte[1024*1024]);//每次增加一个1M大小的数组对象
            } catch (Throwable e) {
                // 堆内存溢出
                e.printStackTrace();// java.lang.OutOfMemoryError: Java heap space
                flag = false;
                System.out.println("count="+i);//记录运行的次数
            }
        }
    }
}

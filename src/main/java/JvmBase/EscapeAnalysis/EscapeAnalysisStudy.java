package JvmBase.EscapeAnalysis;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/14.
 */
public class EscapeAnalysisStudy {

    public static B b;

    /**
     * <p>全局变量赋值发生指针逃逸</p>
     */
    public void globalVariablePointerEscape() {
        b = new B();
    }

    /**
     * <p>方法返回引用，发生指针逃逸</p>
     *
     * @return
     */
    public B methodPointerEscape() {
        return new B();
    }

    /**
     * <p>实例引用发生指针逃逸</p>
     */
    public void instancePassPointerEscape() {
        methodPointerEscape().printClassName(this);
    }

    /**
     * 该方法没有返回，没有给全局变量赋值，没有实例引用
     */
    public void noEscapeMethod () {
        StringBuilder sb = new StringBuilder();
        sb.append("no escape method");
        sb = null;
    }

    class B {
        public void printClassName(EscapeAnalysisStudy clazz) {
            System.out.println(clazz.getClass().getName());
        }
    }
}

import org.junit.Test;

/**
 * Created by lenovo on 2016/9/29.
 */
public class t001 {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    public static int foo() {
        int i = 0;
        try {
            return i;
        } finally {
            System.out.println(++i);
        }
    }
    @Test
    public void hh(){
        System.out.println("中文，嘿嘿嘿");
    }
}


/**
 * Created by lenovo on 2016/9/24.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello maven");
        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("中文，嘿嘿嘿");
    }
}

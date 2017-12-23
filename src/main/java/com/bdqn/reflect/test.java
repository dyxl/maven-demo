package com.bdqn.reflect;

/**
 * Created by lenovo on 2016/10/15.
 */
public class test {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Demo d1=new Demo();
        System.out.println(d1.getX());
        Demo d2=new Demo(100);
        System.out.println(d2.getX());
        Object object=creator();
    }

    private static Object creator() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> c=Class.forName("com.bdqn.reflect.Demo");
        Object object=c.newInstance();
        return object;
    }
}

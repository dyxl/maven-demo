package com.bdqn.reflect;

/**
 * 不可变类型的实例
 */
public class Demo {
    private int x;
    public Demo(){};
    public Demo(int x){
        this.x=x;
    }

    public int getX(){
        return this.x;
    }
}

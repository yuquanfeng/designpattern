package com.alibaba.yqf.designpattern.singleton;


/**
 * @auther yqf
 * @date 2019/6/15 23:03
 *此类为懒汉模式，懒汉模式是在你需要的时候才会去初始化这个实例，但是懒汉模式存在线程安全问题，需要加双检验锁和volatile关键字
 */
public class LanHan {
    private static volatile LanHan instance ;

    public LanHan(){
        System.out.println("懒汉模式实例被实例化了");
    }

    public static LanHan getInstance(){
        if(instance == null){
            synchronized (LanHan.class){
                if(instance  == null){
                    instance = new LanHan();
                }
            }
        }
        return instance;
    }
}
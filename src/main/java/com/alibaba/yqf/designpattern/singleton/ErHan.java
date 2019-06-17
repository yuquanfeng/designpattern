package com.alibaba.yqf.designpattern.singleton;


/**
 * @auther yqf
 * @date 2019/6/15 23:04
 *此类是饿汉模式，饿汉模式属于单例的一种，饿汉模式不管你是否使用该类，都会直接初始化
 */
public class ErHan {
    private static final ErHan instance = new ErHan();
    public ErHan(){
        System.out.println("饿汉模式实例被初始化了");
    }
    public static ErHan getInstance(){
        return instance;
    }
}
package com.alibaba.yqf.designpattern.factory.factoryMethod;

import com.alibaba.yqf.designpattern.entity.Fruit;

/**
 * @auther yqf
 * @date 2019/6/15 16:00
 */
public class TestFactory {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.draw();
        OrangeFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();
        orange.draw();
    }
}
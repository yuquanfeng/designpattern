package com.alibaba.yqf.designpattern.factory.simple;

import com.alibaba.yqf.designpattern.entity.fruit.Apple;
import com.alibaba.yqf.designpattern.entity.Fruit;
import com.alibaba.yqf.designpattern.entity.fruit.Orange;

/**
 * @auther yqf
 * @date 2019/6/15 15:45
 *
 * 此类是简单工厂设计模式，也称为静态工厂设计模式，此模式不属于23中设计模式之一
 * 但是工厂设计模式是基于此模式扩展的
 */
public class FruitStaticFactory {
    public static Apple getAppleInstance(){
        return new Apple();
    }

    public static Orange getOrangeInstance(){
        return new Orange();
    }

    public static void main(String[] args) {
        Fruit apple = FruitStaticFactory.getAppleInstance();
        apple.draw();
        Fruit orange = FruitStaticFactory.getOrangeInstance();
        orange.draw();
    }
}
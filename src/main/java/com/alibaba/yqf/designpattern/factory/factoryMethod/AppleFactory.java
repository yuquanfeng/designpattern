package com.alibaba.yqf.designpattern.factory.factoryMethod;

import com.alibaba.yqf.designpattern.entity.fruit.Apple;
import com.alibaba.yqf.designpattern.entity.Fruit;

/**
 * @auther yqf
 * @date 2019/6/15 15:59
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
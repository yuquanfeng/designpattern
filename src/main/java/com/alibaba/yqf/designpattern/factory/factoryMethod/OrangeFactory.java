package com.alibaba.yqf.designpattern.factory.factoryMethod;

import com.alibaba.yqf.designpattern.entity.Fruit;
import com.alibaba.yqf.designpattern.entity.fruit.Orange;

/**
 * @auther yqf
 * @date 2019/6/15 16:00
 * 工厂模式
 */
public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
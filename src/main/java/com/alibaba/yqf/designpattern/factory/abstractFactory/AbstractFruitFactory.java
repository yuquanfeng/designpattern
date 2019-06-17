package com.alibaba.yqf.designpattern.factory.abstractFactory;

import com.alibaba.yqf.designpattern.entity.Fruit;
import com.alibaba.yqf.designpattern.entity.FruitBag;

/**
 * @auther yqf
 * @date 2019/6/15 16:04
 */
public abstract class AbstractFruitFactory {
    abstract Fruit getFruit();
    abstract FruitBag getBag();
}
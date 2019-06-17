package com.alibaba.yqf.designpattern.factory.factoryMethod;

import com.alibaba.yqf.designpattern.entity.Fruit;

/**
 * @auther yqf
 * @date 2019/6/15 15:55
 *此接口是工厂模式的接口
 */
public interface FruitFactory {
    Fruit getFruit();
}
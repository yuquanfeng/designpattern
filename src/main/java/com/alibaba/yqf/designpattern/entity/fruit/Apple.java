package com.alibaba.yqf.designpattern.entity.fruit;

import com.alibaba.yqf.designpattern.entity.Fruit;
import com.alibaba.yqf.designpattern.entity.fruitBag.AppleBag;

/**
 * @auther yqf
 * @date 2019/6/15 15:47
 */
public class Apple implements Fruit {
    @Override
    public void draw(){
        System.out.println("我是苹果，我的产地是山东烟台");
    }

    @Override
    public String toString() {
        return "Apple{}";
    }

    public void pack(AppleBag appleBag) {
        appleBag.pack();
    }
}
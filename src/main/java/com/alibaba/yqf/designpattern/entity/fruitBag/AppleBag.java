package com.alibaba.yqf.designpattern.entity.fruitBag;

import com.alibaba.yqf.designpattern.entity.FruitBag;

/**
 * @auther yqf
 * @date 2019/6/15 16:09
 */
public class AppleBag implements FruitBag {
    @Override
    public void pack() {
        System.out.println("苹果，用苹果包装盒打包");
    }
}
package com.alibaba.yqf.designpattern.entity.fruitBag;

import com.alibaba.yqf.designpattern.entity.FruitBag;

/**
 * @auther yqf
 * @date 2019/6/15 16:10
 */
public class OrangeBag implements FruitBag {
    @Override
    public void pack() {
        System.out.println("橘子，用橘子包装盒打包");
    }
}
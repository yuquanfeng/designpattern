package com.alibaba.yqf.designpattern.entity.fruit;

import com.alibaba.yqf.designpattern.entity.Fruit;
import com.alibaba.yqf.designpattern.entity.fruitBag.OrangeBag;

/**
 * @auther yqf
 * @date 2019/6/15 15:49
 */
public class Orange implements Fruit {
    @Override
    public void draw(){
        System.out.println("我是橘子，我的产地是浙江杭州");
    }

    @Override
    public String toString() {
        return "Orange{}";
    }

    public void pack(OrangeBag orangeBag){
        orangeBag.pack();
    }
}
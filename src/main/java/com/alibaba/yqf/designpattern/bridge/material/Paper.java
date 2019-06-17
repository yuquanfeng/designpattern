package com.alibaba.yqf.designpattern.bridge.material;

/**
 * @auther yqf
 * @date 2019/6/16 17:28
 */
public class Paper implements Material {
    @Override
    public void draw() {
        System.out.println("");
        System.out.println("我想保护我的家人，我想让他们过上好的生活");
    }
}
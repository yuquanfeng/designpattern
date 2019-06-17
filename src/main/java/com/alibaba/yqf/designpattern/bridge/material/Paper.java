package com.alibaba.yqf.designpattern.bridge.material;

/**
 * @auther yqf
 * @date 2019/6/16 17:28
 */
public class Paper implements Material {
    @Override
    public void draw() {
        System.out.println("");
    }
}
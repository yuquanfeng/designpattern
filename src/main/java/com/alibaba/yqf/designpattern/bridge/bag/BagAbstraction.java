package com.alibaba.yqf.designpattern.bridge.bag;

import com.alibaba.yqf.designpattern.bridge.material.Material;

/**
 * @auther yqf
 * @date 2019/6/16 17:22
 * 此模式是桥接模式
 */
public abstract class BagAbstraction {
    private Material material;
    public void setMaterial(Material material){
        this.material = material;
    }

    public abstract void pack();
}
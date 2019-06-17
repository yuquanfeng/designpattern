package com.alibaba.yqf.designpattern.adapter;

import com.alibaba.yqf.designpattern.entity.fruitBag.AppleBag;
import com.alibaba.yqf.designpattern.entity.fruitBag.OrangeBag;

/**
 * @auther yqf
 * @date 2019/6/15 23:39
 * 此类为适配器模式
 */
public class OrangeAdapter extends OrangeBag {
    private AppleBag appleBag;
    public OrangeAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }
    @Override
    public void pack() {
        appleBag.pack();
    }
}
package com.alibaba.yqf.designpattern.adapter;

import com.alibaba.yqf.designpattern.entity.fruit.Orange;
import com.alibaba.yqf.designpattern.entity.fruitBag.AppleBag;
import com.alibaba.yqf.designpattern.entity.fruitBag.OrangeBag;

/**
 * @auther yqf
 * @date 2019/6/15 23:41
 */
public class TestOrangeAdapter {
    public static void main(String[] args) {
        Orange orange = new Orange();
        OrangeBag orangeBag = new OrangeBag();
        orange.pack(orangeBag);
        //如果此时orangeBage此时没有了pack方法，我们如何用appleBag代替？
        OrangeBag orangeBag1 = getBag();
        orange.pack(orangeBag1);
    }

    public static OrangeBag getBag(){
        AppleBag appleBag = new AppleBag();
        OrangeAdapter orangeAdapter = new OrangeAdapter(appleBag);
        return  orangeAdapter;
    }
}
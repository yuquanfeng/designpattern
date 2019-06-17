package com.alibaba.yqf.designpattern.singleton;

/**
 * @auther yqf
 * @date 2019/6/15 23:16
 */
public class TestSingleTons {
    public static void main(String[] args) {
        LanHan lanHan = LanHan.getInstance();
        LanHan lanHan1 = LanHan.getInstance();
        ErHan erHan = ErHan.getInstance();
        ErHan erHan1 = ErHan.getInstance();
    }
}
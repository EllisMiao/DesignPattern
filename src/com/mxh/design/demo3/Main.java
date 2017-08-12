package com.mxh.design.demo3;

/**
 * 代理模式
 */
public class Main {

    public static void main(String args[]){
        Fangdong f = new Fangdong();
        Zhongjie zhongjie = new Zhongjie(f);
        zhongjie.sell();
        zhongjie.buy();
    }
}

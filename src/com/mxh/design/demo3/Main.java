package com.mxh.design.demo3;

/**
 * 代理模式-静态代理
 */
public class Main {

    public static void main(String args[]){
        //房东
        Fangdong f = new Fangdong();
        //中介
        Zhongjie zhongjie = new Zhongjie(f);
        //房屋消息
        zhongjie.publish();
        //联系客户
        zhongjie.contactCustomer();
        //带客户看房
        zhongjie.seeHouse();
        //签约
        zhongjie.sign();
        //交房
        zhongjie.sell();
    }
}

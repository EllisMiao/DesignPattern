package com.mxh.design.demo3;

import java.lang.reflect.Proxy;

/**
 * 代理模式-动态代理
 */
public class Main2 {

    public static void main(String args[]){

        //房东
        Fangdong fangdong = new Fangdong();
        //动态代理
        DynamicProxy proxy = new DynamicProxy(fangdong);
        //动态构建一个代理对象
        SellHouse sellHouse = (SellHouse) Proxy.newProxyInstance(fangdong.getClass().getClassLoader(),fangdong.getClass().getInterfaces(),proxy);
        //发布
        sellHouse.publish();
        //联系客户
        sellHouse.contactCustomer();
        //带人看房
        sellHouse.seeHouse();
        //签约
        sellHouse.sign();
        //卖房
        sellHouse.sell();
    }
}

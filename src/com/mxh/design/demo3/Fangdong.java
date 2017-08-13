package com.mxh.design.demo3;

/**
 * 房东
 */
public class Fangdong implements SellHouse {


    @Override
    public void publish() {
        System.out.println("发布房屋出售消息");
    }

    @Override
    public void contactCustomer() {
        System.out.println("联系客户");
    }

    @Override
    public void seeHouse() {
        System.out.println("带客户看房");
    }

    @Override
    public void sign() {
        System.out.println("签约");
    }

    @Override
    public void sell() {
        System.out.println("卖房");
    }
}

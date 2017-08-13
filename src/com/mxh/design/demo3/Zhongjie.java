package com.mxh.design.demo3;

/**
 * 中介
 */
public class Zhongjie implements SellHouse {

    private Fangdong fangdong;

    public Zhongjie(Fangdong fangdong){
        this.fangdong = fangdong;
    }


    @Override
    public void publish() {
        fangdong.publish();
    }

    @Override
    public void contactCustomer() {
        fangdong.contactCustomer();
    }

    @Override
    public void seeHouse() {
        fangdong.seeHouse();
    }

    @Override
    public void sign() {
        fangdong.sign();
    }

    @Override
    public void sell() {
        fangdong.sell();
    }
}

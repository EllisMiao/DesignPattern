package com.mxh.design.demo3;

/**
 * 中介
 */
public class Zhongjie implements House{

    private Fangdong fangdong;

    public Zhongjie(Fangdong fangdong){
        this.fangdong = fangdong;
    }

    @Override
    public void buy() {
        fangdong.buy();
    }

    @Override
    public void sell() {
        fangdong.sell();
    }
}

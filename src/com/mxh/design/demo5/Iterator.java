package com.mxh.design.demo5;

/**
 * 迭代器
 */
public interface Iterator {

    /**
     * 是否有下一个对象
     * @return
     */
    public boolean hasNext();

    /**
     * 获取下一个对象
     * @return
     */
    public Object next();
}

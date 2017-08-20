package com.mxh.design.demo5;

/**
 * 容器角色
 */
public interface List {

    /**
     * 添加
     * @param object
     */
    public void add(Object object);
    /**
     * 取值
     * @param index
     * @return
     */
    public Object get(int index);

    /**
     * 迭代
     * @return
     */
    public Iterator iterator();
    /**
     * 获取长度
     * @return
     */
    public int getSize();
}

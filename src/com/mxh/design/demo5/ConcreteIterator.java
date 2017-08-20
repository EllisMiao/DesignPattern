package com.mxh.design.demo5;

/**
 * 迭代器实现类
 */
public class ConcreteIterator implements Iterator{

    private List list = null;
    private int index;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index<list.getSize()){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}

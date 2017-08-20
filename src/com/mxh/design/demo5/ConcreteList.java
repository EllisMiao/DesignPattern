package com.mxh.design.demo5;

/**
 * 容器实现类
 */
public class ConcreteList implements List{

    public Object[] objects;

    public int size;
    public int index;

    public ConcreteList(){
        index = 0;
        size = 5;
        objects = new Object[size];
    }

    @Override
    public void add(Object object) {
        //动态增长数组长度
//        if(index>=size){
//            size = size*2;
//            Object[] objectnew = new Object[size];
//            for(int i=0;i<objects.length;i++){
//                objectnew[i] = objects[i];
//            }
//            objects = objectnew;
//
//        }
        objects[index] = object;
        index++;
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return index;
    }
}

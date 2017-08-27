package com.mxh.design.demo12;

/**
 * 设计模式之中介者模式
 */
public class Main {

    public static void main(String args[]){

        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage("你好");
        user2.sendMessage("Hello");
    }
}

package com.mxh.design.demo12;

public class User {

    public String name;

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}

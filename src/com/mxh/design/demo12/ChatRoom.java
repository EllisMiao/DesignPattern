package com.mxh.design.demo12;

import java.util.Date;

/**
 * 聊天室中介者
 */
public class ChatRoom {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+"["+user.name+"];"+message);
    }
}

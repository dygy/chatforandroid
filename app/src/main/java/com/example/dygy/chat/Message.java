package com.example.dygy.chat;

import java.sql.Date;

/**
 * Created by Dygy on 17.07.2017.
 */

public class Message {

    private String textMessage;
    private String autor;
    private Long timeMessage;

    public  Message(String textMessage, String autor){
        this.textMessage  = textMessage;
        this.autor = autor;

        timeMessage = new java.util.Date().getTime();
    }
    public Message(){
    }
    public  String getTextMessage(){
        return textMessage;
    }
    public void setTextMessage(String textMessage){
        this.textMessage = textMessage;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public long getTimeMessage(){
        return timeMessage;
    }
    public void setTimeMessage(long timeMessage){
        this.timeMessage = timeMessage;
    }
}

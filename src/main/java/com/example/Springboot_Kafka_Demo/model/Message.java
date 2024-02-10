package com.example.Springboot_Kafka_Demo.model;

import java.util.List;

public class Message {

    private String msg;
    private String name;
    private List<Message> mList;

    public Message(String msg, String name, List<Message> mList) {
        super();
        this.msg = msg;
        this.name = name;
        this.mList = mList;
    }
    public List<Message> getmList() {
        return mList;
    }
    public void setmList(List<Message> mList) {
        this.mList = mList;
    }
    public Message() {}

    @Override
    public String toString() {
        return "Message [msg=" + msg + ", name=" + name + ", mList=" + mList + "]";
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
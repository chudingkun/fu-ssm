package com.fuhao.pojo;

public class Message {
    private String messagetext;
    private String messagetime;

    @Override
    public String toString() {
        return "Message{" +
                "messagetext='" + messagetext + '\'' +
                ", messagetime='" + messagetime + '\'' +
                '}';
    }

    public Message(String messagetext, String messagetime) {
        this.messagetext = messagetext;
        this.messagetime = messagetime;
    }
    public Message() { }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime;
    }
}

package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonView;

public class emailRequest {
    @JsonView
    private String requestUid;
    Messages MessagesObject;

    public String getRequestUid() {
        return requestUid;
    }

    public void setRequestUid(String requestUid) {
        this.requestUid = requestUid;
    }

    public Messages getMessages() {
        return MessagesObject;
    }

    public void setMessages( Messages messagesObject ) {
        this.MessagesObject = messagesObject;
    }
}

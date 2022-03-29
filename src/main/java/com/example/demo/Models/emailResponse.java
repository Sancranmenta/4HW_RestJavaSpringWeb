package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonView;

public class emailResponse {
    @JsonView
    private String value;
    Status StatusObject;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Status getStatusObject() {
        return StatusObject;
    }

    public void setStatusObject(Status statusObject) {
        StatusObject = statusObject;
    }
}

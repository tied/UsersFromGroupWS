package com.atlassian.plugins.tutorial.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersFromGroupModel {

    @XmlElement(name = "value")
    private String message;

    public UsersFromGroupModel() {
    }

    public UsersFromGroupModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
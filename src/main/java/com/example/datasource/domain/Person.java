package com.example.datasource.domain;

import java.io.Serializable;

public class Person implements Serializable{

    private String userId;

    private String loginHpone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginHpone() {
        return loginHpone;
    }

    public void setLoginHpone(String loginHpone) {
        this.loginHpone = loginHpone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", loginHpone='" + loginHpone + '\'' +
                '}';
    }
}

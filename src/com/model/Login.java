package com.model;

public class Login {
    private String account;
    private String password;
    public String getAccount() {
        return account;
    }

    public Login() {
    }

    public Login(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.SpringRtc.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public User(String username, String email, String password, String status) {
        Username = username;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public String Username;
public String email;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String password;
public String status;

}

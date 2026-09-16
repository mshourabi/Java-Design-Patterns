package net.majid.behavioral.chainofresponsibility;

class Request {

    String username;
    String token;
    String data;

    public Request(String username, String token, String data) {
        this.username = username;
        this.token = token;
        this.data = data;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

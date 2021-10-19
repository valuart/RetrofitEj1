package com.example.retrofitej1.modelo;



public class Post {
    private int userId;
    private int Id;
    private String tittle;
    private String body;

    public Post() {
    }

    public Post(Integer userId, Integer id, String tittle, String body) {
        this.userId = userId;
        Id = id;
        this.tittle = tittle;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

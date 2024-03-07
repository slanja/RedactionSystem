package org.example;

public class Users {
    private int ID;
    private String username;
    private int age;
    private String password;
    private String[] articleList;
    private int privileges;

    public Users(int ID, String username, int age, String password, String[] articleList) {
        this.ID = ID;
        this.username = username;
        this.age = age;
        this.password = password;
        this.articleList = articleList;
    }

    public Users(int ID, String username, int age, String password, String[] articleList, int privileges) {
        this.ID = ID;
        this.username = username;
        this.age = age;
        this.password = password;
        this.articleList = articleList;
        this.privileges = privileges;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setArticleList(String[] articleList) {
        this.articleList = articleList;
    }

    public void setPrivileges(int privileges) {
        this.privileges = privileges;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String[] getArticleList() {
        return articleList;
    }

    public int getPrivileges() {
        return privileges;
    }
}
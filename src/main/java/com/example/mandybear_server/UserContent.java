package com.example.mandybear_server;

public class UserContent {
    private String content;
    private int usersCnt;

    public UserContent() {
    }

    public UserContent(String content,int usersCnt) {
        this.content = content;
        this.usersCnt = usersCnt;
    }



    public String getContent() {
        return content;
    }
    public int getUsersCnt(){
        return usersCnt;
    }


    public void setContent(String content) {
        this.content = content;
    }
    public void setUsersCnt(int usersCnt) {
        this.content = content;
    }
}

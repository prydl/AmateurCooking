package com.example.amateurcooking;

public class AchievementsItem {

    String title, content, date;
    int achievementPhoto;

    //required empty constructor
    public AchievementsItem() {

    }

    //constructor with arguments
    public AchievementsItem(String title, String content, String date, int achievementPhoto) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.achievementPhoto = achievementPhoto;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAchievementPhoto(int achievementPhoto) {
        this.achievementPhoto = achievementPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public int getAchievementPhoto() {
        return achievementPhoto;
    }


}

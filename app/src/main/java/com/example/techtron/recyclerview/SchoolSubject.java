package com.example.techtron.recyclerview;

/**
 * Created by user on 2/4/2018.
 */

public class SchoolSubject {
    //basic blue print of each school subject so what does a school subject have
    String subjectName;
    boolean ishomeworkdone;
    int imageResId;

    public SchoolSubject(String subjectName, boolean isHomeworkDone, int imageResId) {
        this.subjectName = subjectName;
        //this depends on wheather the box is checked or not
        this.isHomeworkDone = isHomeworkDone;
        //image resource, r dot draw will dot whateever resource that integer is pointing toward
        this.imageResId = imageResId;
    }
}

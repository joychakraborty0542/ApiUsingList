package com.dailyjoy0542.employeesystemapi.enitities;

import java.util.Date;

public class Courses {

    private int CourseId;
    private String CourseName;
    private int CourseDuration;

    public Courses() {
    }

    public Courses(int courseId, String courseName, int courseDuration) {
        CourseId = courseId;
        CourseName = courseName;
        CourseDuration = courseDuration;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getCourseDuration() {
        return CourseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        CourseDuration = courseDuration;
    }
}

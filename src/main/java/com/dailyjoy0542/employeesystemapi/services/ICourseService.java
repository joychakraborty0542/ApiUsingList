package com.dailyjoy0542.employeesystemapi.services;

import com.dailyjoy0542.employeesystemapi.enitities.Courses;

import java.util.List;

public interface ICourseService {
    public List<Courses> getCourses();



   // public List<Courses> addCourse();

    public Courses updateCourse(Courses c);


    public Courses getCourse(long corseID);

    public Courses addCourse(Courses course);

    public void deleteCourse(long parseLong);
}

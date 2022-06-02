package com.dailyjoy0542.employeesystemapi.services;

import com.dailyjoy0542.employeesystemapi.enitities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServicImpl implements ICourseService{

    List<Courses> list;
    public CourseServicImpl()
    {
        list= new ArrayList<>();
        list.add(new Courses(101,"Java",2));
        list.add(new Courses(102,"Javascript",3));

    }

    @Override
    public List<Courses> getCourses() {


        return list;
    }




    @Override
    public Courses updateCourse(Courses course1) {
       for (Courses c:list)
       {
           if(c.getCourseId()==course1.getCourseId())
           {
               c.setCourseDuration(course1.getCourseDuration());
               c.setCourseName(course1.getCourseName());

           }

       }
        return course1;
    }

    @Override
    public Courses getCourse(long corseID) {
        Courses c =null;
        for(Courses course:list)
        {
            if(course.getCourseId()==corseID)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses course) {
        list.add(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list=this.list.stream().filter(e->e.getCourseId()!=parseLong).collect(Collectors.toList());
    }


}

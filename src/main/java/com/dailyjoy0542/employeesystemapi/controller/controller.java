package com.dailyjoy0542.employeesystemapi.controller;

import com.dailyjoy0542.employeesystemapi.enitities.Courses;
import com.dailyjoy0542.employeesystemapi.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class controller {
    @Autowired
    ICourseService courseService;
    @GetMapping("/home")
    public String home(){
       return "this is home page";
    }
    @GetMapping("/courses")
    public List<Courses> getCourses(){

  return  this.courseService.getCourses();
    }

    @GetMapping("/courses/{corseID}")
    public Courses  getCoursesbyCourseId(@PathVariable String corseID)
    {
        return  this.courseService.getCourse(Long.parseLong(corseID));
    }
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course)
    {
        return this.courseService.addCourse(course);
    }
    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses course)
    {
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
    {
        try{
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e )
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}

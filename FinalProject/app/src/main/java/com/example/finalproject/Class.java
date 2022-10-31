package com.example.finalproject;

import java.util.ArrayList;

public class Class {
    /*
+ className: String
+ courseCode: int
+ courseDays: String
+ courseHours: String
+ capacity: int
+ studentsEnrolled: arrayList[Student]
*/
    public String className;
    public String courseCode;
    public String courseDays;
    public String courseHours;
    public int capacity;
    public ArrayList<Student> studentsEnrolled;
    public Instructor teachingInstructor;

    public Class(String className, String courseCode){
        this.className=className;
        this.courseCode=courseCode;
        courseDays="";
        courseHours="";
        capacity=0;
        studentsEnrolled=new ArrayList<>();
        teachingInstructor=null;
    }
    public String getClassName(){
        return className;
    }

    public String getCourseCode(){
        return courseCode;
    }

    /*
    public String getCourseDays(){
        return courseDays;
    }
    public void setClassName(String in){
        className=in;
    }
    public void setCourseCode(String in){
        courseCode = in;
    }

    public void setCourseDays(String in){
        courseDays=in;
    }
    public String getCourseHours(){
        return  courseHours;
    }
    public void setCourseHours(String in){
        courseHours=in;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int in){
        capacity=in;
    }
    public ArrayList<Student> getStudentsEnrolled(){
        return studentsEnrolled;
    }
    public void addStudentToClass(Student in){
        studentsEnrolled.add(in);
    }
    public Instructor getTeachingInstructor(){
        return teachingInstructor;
    }
    public void setTeachingInstructor(Instructor in){

        teachingInstructor=in;
    }
    */


}


package com.example.finalproject;

import java.util.ArrayList;

public class Student {
    /*
- firstName: String
- lastName: String
- studentID: int
- enrolledCourses: arrayList[Class]
- creditedCourses: arrayList[Class]
*/
    public String password;
    public String studentID;
    public ArrayList<Class> enrolledCourses;

    public Student(String user, String pass){
        studentID=user;
        password=pass;
    }
    public String getPassword(){
        return password;
    }
    public String getstudentID(){
        return studentID;
    }
}

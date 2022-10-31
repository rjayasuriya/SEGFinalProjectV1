package com.example.finalproject;

import java.util.ArrayList;

public class Instructor {
    /*
    * - firstName: String
- lastName: String
- instructorID: int
- teachingCourses: arrayList[Class]
 * */
    public String password;
    public String instructorID;
    public ArrayList<Class> teachingCourses;

    Instructor(String user, String pass){
        password=pass;
        instructorID = user;
    }

    public String getinstructorID(){
        return instructorID;
    }
    public String getPassword(){
        return password;
    }
    public String getInstructorID(){
        return instructorID;
    }




}

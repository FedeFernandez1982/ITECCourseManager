package com.federico;

import java.util.ArrayList;

public class ITECCourse {

    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String classroom;

    //Class constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseClassRoom) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom =  courseClassRoom;
    }
    public void addStudent(String studentName) {
        //don't need to check if students is null - the constructor set it up

        // If the number of students is the same as the max allowed, can't add any more

        if (students.size() < this.maxStudents) {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);  }
        else {
            //There is no room for this student

            System.out.println(this.name + " is full, max number of students is " +
                    this.maxStudents + ". " + studentName + " not added" ); }}
    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);}
        else {
            System.out.println(studentName + " was not found in this course");} }
    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Classroom: " + getClassroomName() );
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student); }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + this.maxStudents);  }
    public int getNumberOfStudents() {
        return this.students.size();
    }
    public String getClassroomName(){
        return this.classroom;
    }
    public void setCourseRoom(String newClassRoom) {
        this.classroom = newClassRoom;
    }

}

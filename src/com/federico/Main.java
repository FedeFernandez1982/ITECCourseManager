package com.federico;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList <ITECCourse> CourseList = new ArrayList<ITECCourse>();//Array list to store the objects

        ITECCourse maintenance = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "3050");
        maintenance.addStudent("Anna");
        maintenance.addStudent("Bill");
        maintenance.addStudent("Carl");
        CourseList.add(0,maintenance); //adding the object to the array list

        ITECCourse datacom = new ITECCourse("Data Communications", 1425, 30, "3030");
        datacom.addStudent("Dave");
        datacom.addStudent("Ed");
        datacom.addStudent("Flora");
        CourseList.add(1,datacom); //adding the object to the array list

        ITECCourse small = new ITECCourse("Small Course", 1111, 3, "1020");
        small.addStudent("Jake");
        small.addStudent("Kirby");
        small.addStudent("Liam");
        small.addStudent("Marigold");
        CourseList.add(2,small); //adding the object to the array list

        for(int i = 0; i< CourseList.size(); i++)
            System.out.println(CourseList.get(i));
    }
}



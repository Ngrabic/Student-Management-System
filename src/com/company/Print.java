package com.company;

import java.util.ArrayList;

public class Print {

    public void printCourses(){
        System.out.println("What courses you want to be enrolled (Q for exit): ");
        System.out.println("A  History 101");
        System.out.println("B  Matematics 101");
        System.out.println("C  English 101");
        System.out.println("D  Chemistry 101");
        System.out.println("E  Computer Science 101");
    }
    public void printYears(){
        System.out.println("What year do you attend:  ");
        System.out.println("1  Freshman");
        System.out.println("2  Junior");
        System.out.println("3  Sophore");
        System.out.println("4  senior");
    }
    public void printStudentData(int i , ArrayList<Student> studentList, int grade){
        System.out.println("Student name: " + studentList.get(i).getName());
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentList.get(i).getId());
        System.out.println("Courses Enrolled: ");
        for (int j=0;j<studentList.get(i).courseList.size();j++) {
            System.out.println(studentList.get(i).courseList.get(j));
        }
        System.out.println("Balance: " + studentList.get(i).balance);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Print print = new Print();

        System.out.print("How many student will be enrolled: ");
        int initialLenght=scanner.nextInt();
        ArrayList<Student> studentList=new ArrayList<>(initialLenght);

        for (int i=0;i<initialLenght;i++){

            print.printYears();
            System.out.print("Choose a year: ");
            int grade= scanner.nextInt();

            System.out.println("Write name of student: ");
            studentList.add(new Student(scanner.next(),grade));
            studentList.get(i).setId(Integer.valueOf(String.valueOf(grade) + "1010"));

            print.printCourses();                           //choose Courses
            studentList.get(i).courseEnroll(i,studentList); //


            System.out.println("How much student has paid: ");
            studentList.get(i).setPaidFees(scanner.nextInt());
            studentList.get(i).balance= studentList.get(i).balance - studentList.get(i).getPaidFees();

            print.printStudentData(i,studentList,grade);  //Print final data about student


            System.out.println("Another student (Y OR N)");
            char replay=scanner.next().charAt(0);

            if (i<initialLenght-1) {
                if (replay == 'N')
                    break;
            }

        }


    }
}

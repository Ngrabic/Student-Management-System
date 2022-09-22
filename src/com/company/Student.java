package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int grade;
    private int id;
    public int balance;
    private int paidFees;
    ArrayList<String> courseList= new ArrayList<>();
    Scanner scanner=new Scanner(System.in);


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void courseEnroll(int i, ArrayList<Student> studentList){
        while (true) {
            char coursesEnrlolled=scanner.next().charAt(0);

            if (coursesEnrlolled =='Q')
                break;

            switch (coursesEnrlolled) {
                case 'A':
                    studentList.get(i).courseList.add("History 101");
                    studentList.get(i).balance=studentList.get(i).balance + 600 ;
                    System.out.print("History 101");
                    break;
                case 'B':
                    studentList.get(i).courseList.add("Matematics 101");
                    studentList.get(i).setBalance(studentList.get(i).getBalance() + 600);
                    break;
                case 'C':
                    studentList.get(i).courseList.add("English 101");
                    studentList.get(i).setBalance(studentList.get(i).getBalance() + 600);
                    break;
                case 'D':
                    studentList.get(i).courseList.add("Chemistry 101");
                    studentList.get(i).setBalance(studentList.get(i).getBalance() + 600);
                    break;
                case 'E':
                    studentList.get(i).courseList.add("Computer Science 101");
                    studentList.get(i).setBalance(studentList.get(i).getBalance() + 600);
                    break;
                case 'Q':
                    break;

            }

        }
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(int paidFees) {
        this.paidFees = paidFees;
    }


}

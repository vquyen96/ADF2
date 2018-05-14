/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Quyeens
 */
public class StudentController {
    
    Student student = new Student();
    public ArrayList<Student> listStudents = new ArrayList<>();
    public void menu(){
        System.out.println("================= Menu ==================");
        System.out.println("1. Add new student");
        System.out.println("2. Save");
        System.out.println("3. Display all student");
        System.out.println("4. Exit");
        
    }
    
    public static void displayStudent() throws FileNotFoundException, IOException {
        System.out.println("================= ListSV ==================");
        FileReader fr = new FileReader(".//students.dat");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i=fr.read()) != -1){
            System.out.print((char) i);
        }
    }
    public void addStudent(){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("============= Add New Student ============");
        System.out.println("Nhap ma sinh vien");
        student.setEnrolID(sc.nextLine());
        System.out.println("Nhap FirstName:");
        student.setFirstName(sc.nextLine());
        System.out.println("Nhap Last Name");
        student.setLastName(sc.nextLine());
        System.out.println("Nhap Tuoi");
        student.setAge(sc.nextInt());
        listStudents.add(student);
    }
    public void save(){
        try{
            FileWriter fw = new FileWriter(".//students.dat",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student listStudent : listStudents) {
                bw.write(String.format("%-10s",listStudent.getEnrolID()));
                bw.write(String.format("%10s",listStudent.getFirstName())+" ");
                bw.write(String.format("%-10s",listStudent.getLastName()));
                bw.write(String.format("%-5s",listStudent.getAge()));
                bw.newLine();
            }
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mountannotation;

/**
 *
 * @author ASUS
 */
public class TEacher {

    private String schholName;
    private double salary;
    private Student[] students;

    @Bosholmasin
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getSchholName() {
        return schholName;
    }

    public void setSchholName(String schholName) {
        this.schholName = schholName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @SuppressWarnings(value = "")
    public void method(int a) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
    }

}

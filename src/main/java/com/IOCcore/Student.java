package com.IOCcore;

public class Student {
    int StudentId;
    String StudentName;
    String StudentAddress;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public Student(String studentAddress, String studentName, int studentId) {
        StudentAddress = studentAddress;
        StudentName = studentName;
        StudentId = studentId;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}

package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String EmpName;
    private List<String> EmpPhones;
    private Set<String> EmpAddress;
    private Map<String,String> EmpCourses;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public List<String> getEmpPhones() {
        return EmpPhones;
    }

    public void setEmpPhones(List<String> empPhones) {
        EmpPhones = empPhones;
    }

    public Set<String> getEmpAddress() {
        return EmpAddress;
    }

    public void setEmpAddress(Set<String> empAddress) {
        EmpAddress = empAddress;
    }

    public Map<String, String> getEmpCourses() {
        return EmpCourses;
    }

    public void setEmpCourses(Map<String, String> empCourses) {
        EmpCourses = empCourses;
    }

    public Emp(String empName, List<String> empPhones, Set<String> empAddress, Map<String, String> empCourses) {
        EmpName = empName;
        EmpPhones = empPhones;
        EmpAddress = empAddress;
        EmpCourses = empCourses;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpPhones=" + EmpPhones +
                ", EmpAddress=" + EmpAddress +
                ", EmpCourses=" + EmpCourses +
                '}';
    }
}

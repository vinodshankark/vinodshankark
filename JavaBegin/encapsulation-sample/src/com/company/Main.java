package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Emp a1 = new Emp();
        a1.setEmpId(4);
        a1.setEmpName("Vinod");
        System.out.println(a1.getEmpId());
        System.out.println(a1.getEmpName());
        Emp b1 = new Emp();
        b1.setEmpId(5);
        b1.setEmpName("Shankar");
        System.out.println(b1.getEmpId());
        System.out.println(b1.getEmpName());
    }
}

class Emp {

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private int empId;
    private String empName;
}
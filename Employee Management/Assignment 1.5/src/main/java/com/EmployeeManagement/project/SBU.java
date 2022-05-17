package com.EmployeeManagement.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//public record SBU(int sbuCode,
//           String sbuName,
//           String sbuHead,
//           @Autowired
//           List<Employee> empList){
//    @Override
//    public String toString() {
//        return "SBU details\n" +
//                "---------------------------------\n" +
//                "sbuCode=" + sbuCode +
//                ", sbuName='" + sbuName + '\'' +
//                ", sbuHead='" + sbuHead + '\'' +
//                "\nEmployee details:----------------\n" +
//                empList;
//    }
//}

public class SBU {
    int sbuCode;
    String sbuName;
    String sbuHead;
    @Autowired
    List<Employee> empList;

    public SBU(int sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
        this.sbuCode = sbuCode;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
        this.empList = empList;
    }

    public int getSbuCode() {
        return sbuCode;
    }

    public void setSbuCode(int sbuCode) {
        this.sbuCode = sbuCode;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "SBU details\n" +
                "---------------------------------\n" +
                "sbuCode=" + sbuCode +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                "\nEmployee details:----------------\n" +
                empList;
    }

}

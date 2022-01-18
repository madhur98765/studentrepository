package com.example.demo.studentmodel;

import com.example.demo.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student_info")
@Entity
public class Student extends BaseEntity {

    @Getter
    @Setter
    private String studentName;

    @Getter
    @Setter
    private String studentROllNumber;

    @Getter
    @Setter
    private String contact;

    @Getter
    @Setter
    private String studentClass;

    public Student() {
    }

    public Student(String studentName, String studentROllNumber, String contact, String studentClass) {
        this.studentName = studentName;
        this.studentROllNumber = studentROllNumber;
        this.contact = contact;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentROllNumber='" + studentROllNumber + '\'' +
                ", contact='" + contact + '\'' +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}

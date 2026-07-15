package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // Assumption: only valid objects are passed to this method.
    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();
        String grade;

        boolean hasFail = false;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] < 35) {
                hasFail = true;
            }
        }

        if (hasFail) {
            grade = "F";
        } else if (sum < 150) {
            grade = "C";
        } else if (sum < 200) {
            grade = "B";
        } else if (sum < 250) {
            grade = "A";
        } else {
            grade = "A+";
        }

        return grade;
    }

    public String validate(Student s)
            throws NullNameException, NullMarksArrayException, NullStudentObjectException {

        if (s == null) {
            throw new NullStudentObjectException();
        } else {
            if (s.getName() == null) {
                throw new NullNameException();
            } else if (s.getMarks() == null) {
                throw new NullMarksArrayException();
            } else {
                return "VALID";
            }
        }
    }
}
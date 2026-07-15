package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    StudentMain() { // Constructor

        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        // initialize the objects
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        // trigger the instance initialization defined in the constructor
        new StudentMain();

        StudentReport report = new StudentReport();

        for (int i = 0; i < data.length; i++) {
            try {
                String result = report.validate(data[i]);
                if (result.equals("VALID")) {
                    String grade = report.findGrades(data[i]);
                    System.out.println("Grade for student at index " + i + " : " + grade);
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();

        int nullMarksCount = service.findNumberOfNullMarksArray(data);
        System.out.println("Number of null marks arrays: " + nullMarksCount);

        int nullNameCount = service.findNumberOfNullName(data);
        System.out.println("Number of null names: " + nullNameCount);

        int nullObjectCount = service.findNumberOfNullObjects(data);
        System.out.println("Number of null objects: " + nullObjectCount);
    }
}
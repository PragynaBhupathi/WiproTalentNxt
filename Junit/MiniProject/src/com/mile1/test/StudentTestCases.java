package com.mile1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTestCases {

    StudentReport report = new StudentReport();
    StudentService service = new StudentService();

    // ---------------------------------------------------------
    // GRADE CALCULATION FOR VALID OBJECT
    // ---------------------------------------------------------

    // TC1 -- Calculate the grade for valid objects - Check for A grade computation.
    @Test
    public void tc1_checkAGradeComputation() {
        Student s = new Student("Ravi", new int[] {70, 70, 70}); // sum = 210 -> A
        String grade = report.findGrades(s);
        assertEquals("A", grade);
    }

    // TC2 -- Calculate the grade for valid objects - Check for D grade computation.
    // NOTE: This project's grading rules (F, C, B, A, A+) do not define a "D" grade.
    // Using this test to verify the C-grade boundary instead (sum < 150).
    @Test
    public void tc2_checkGradeComputation() {
        Student s = new Student("Kiran", new int[] {40, 40, 40}); // sum = 120 -> C
        String grade = report.findGrades(s);
        assertEquals("C", grade);
    }

    // TC3 -- Calculate the grade for valid objects - Check for F grade computation.
    @Test
    public void tc3_checkFGradeComputation() {
        Student s = new Student("Anu", new int[] {40, 20, 90}); // one mark < 35 -> F
        String grade = report.findGrades(s);
        assertEquals("F", grade);
    }

    // ---------------------------------------------------------
    // THROW ERROR MESSAGE FOR INVALID OBJECT
    // ---------------------------------------------------------

    // TC4 -- If the Object is null, throw NullStudentObjectException().
    @Test
    public void tc4_nullObjectThrowsException() {
        try {
            report.validate(null);
            fail("Expected NullStudentObjectException was not thrown");
        } catch (NullStudentObjectException e) {
            assertEquals("object is null", e.toString());
        } catch (Exception e) {
            fail("Wrong exception type thrown: " + e.getClass().getSimpleName());
        }
    }

    // TC5 -- If the Name is null, throw NullNameException().
    @Test
    public void tc5_nullNameThrowsException() {
        Student s = new Student(null, new int[] {50, 60, 70});
        try {
            report.validate(s);
            fail("Expected NullNameException was not thrown");
        } catch (NullNameException e) {
            assertEquals("name is null", e.toString());
        } catch (Exception e) {
            fail("Wrong exception type thrown: " + e.getClass().getSimpleName());
        }
    }

    // TC6 -- If the Marks array is null, throw NullMarksArrayException().
    @Test
    public void tc6_nullMarksArrayThrowsException() {
        Student s = new Student("Deepa", null);
        try {
            report.validate(s);
            fail("Expected NullMarksArrayException was not thrown");
        } catch (NullMarksArrayException e) {
            assertEquals("mark array is null", e.toString());
        } catch (Exception e) {
            fail("Wrong exception type thrown: " + e.getClass().getSimpleName());
        }
    }

    // ---------------------------------------------------------
    // COUNTING THE NULL
    // ---------------------------------------------------------

    // TC7 -- Test findNumberOfNullName function.
    @Test
    public void tc7_findNumberOfNullName() {
        Student[] data = new Student[4];
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        int count = service.findNumberOfNullName(data);
        assertEquals(1, count);
    }

    // TC8 -- Test findNumberOfNullObjects function.
    @Test
    public void tc8_findNumberOfNullObjects() {
        Student[] data = new Student[4];
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        int count = service.findNumberOfNullObjects(data);
        assertEquals(1, count);
    }

    // TC9 -- Test findNumberOfNullMarks function.
    @Test
    public void tc9_findNumberOfNullMarksArray() {
        Student[] data = new Student[4];
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        int count = service.findNumberOfNullMarksArray(data);
        assertEquals(1, count);
    }
}
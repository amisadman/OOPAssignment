package GradeBook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sadman Islam
 */
public class GradeBookTest {

    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook myGradeBooks = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for %n%s%n%n", myGradeBooks.getCourseName());
        myGradeBooks.processGrade();
    }
}

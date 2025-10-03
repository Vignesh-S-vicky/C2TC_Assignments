package com.tnsif.assignment_two;

/**
 * Main class for Assignment 2.
 */
public class AssignmentTwoMain {
    public static void main(String[] args) {
        // Creating Student (default constructor prints message)
        Student s1 = new Student();

        // Commission flow
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}


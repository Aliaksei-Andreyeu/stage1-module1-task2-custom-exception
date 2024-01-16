package com.epam.mjc;

public class CustomStudentNotFoundException extends IllegalArgumentException {
    public CustomStudentNotFoundException(long id) {
        super("Could not find student with ID " + id);
    }
}
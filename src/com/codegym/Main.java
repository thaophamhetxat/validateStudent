package com.codegym;

public class Main {
    private static String[] validate = new String[]{"C0318G"};
    private static String[] invalidate = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        ValidateStudent validateStudent = new ValidateStudent();
        for (String student : validate) {
            boolean isvalid = validateStudent.validate(student);
            System.out.println("Name is " + student + " is valid: " + isvalid);
        }
        for (String student : invalidate) {
            boolean isvalid = validateStudent.validate(student);
            System.out.println("Name is " + student + " is valid: " + isvalid);
        }

    }
}

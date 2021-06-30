package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateStudent {
    private static final String STUDENT_REGEX = "^[CAP][0-9]{4,}[GHIKLM]$";

    public ValidateStudent() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(STUDENT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

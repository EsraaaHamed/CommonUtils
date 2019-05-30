package com.example.utilstask.utils.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidation {
    static Pattern pattern;
    static Matcher matcher;
    public static boolean isEmailValid(String email) {

        final String EMAIL_PATTERN =
                "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isPasswordValid(String password) {
        Pattern pattern;
        Matcher matcher;
        // This means password must contains 1) at least one digit 2) lower case letter 3) upper case letter 4) one special char 5) there is not a white space 6) must be at least 8 chars
        final String PASSWORD_PATTERN =
                "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return  matcher.matches();


    }

    public static  boolean isLoginValid(String email , String password)
    {
        return isPasswordValid(password) && isEmailValid(email);
    }

}

package com.example.utilstask.utils.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static Matcher matcher;
    private static final Pattern EMAIL_PATTERN =Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    // This means password must contains 1) at least one digit 2) lower case letter 3) upper case letter 4) one special char 5) there is not a white space 6) must be at least 8 chars
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}",Pattern.CASE_INSENSITIVE);
    //this means any name must have at least 3 chars and  less than or equal 14 chars with any upper or lower case
    private static final  Pattern USER_NAME_PATTERN = Pattern.compile( "^[a-zA-Z0-9_-]{3,14}$");

    public static boolean isEmailValid(String email) {
        matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static boolean isPasswordValid(String password) {
        matcher = PASSWORD_PATTERN.matcher(password);
        return  matcher.matches();
    }

    public  static boolean isUserNameORFirstNameOrLastNameValid (String name)
    {
        matcher = USER_NAME_PATTERN.matcher(name);
        return  matcher.matches();
    }

    public static  boolean isLoginValid(String email , String password)
    {
        return isPasswordValid(password) && isEmailValid(email);
    }

}

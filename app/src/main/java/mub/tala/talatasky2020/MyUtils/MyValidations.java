package mub.tala.talatasky2020.MyUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * מחלקה שבודקת תקינות שרות כמו אימיל וסיסמה ועוד
 */
public class MyValidations {
    private Pattern pattern;
    private Matcher matcher;
    private static final String PASSWORD_PATTERN="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

    public MyValidations() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    public boolean validatepassword(final String password) {

        matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        return matches;

    }
}



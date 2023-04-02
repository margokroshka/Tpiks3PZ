package Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public static boolean reg(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("\\w");
        try {
            Matcher matcher = pattern.matcher(login);
            if (matcher.find() && login.length() < 20) {
                throw new WrongLoginException("Login подходит");
            }
            return true;
        } catch (WrongLoginException e) {
            System.out.println("Не подходит"+e);

        }

        try {
            Matcher matcher = pattern.matcher(password);
            if (matcher.find() && password.length() < 20 && password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password подходит");
            }
            return true;
        } catch (WrongPasswordException ex) {
            System.out.println("Не подходит "+ex);
            return false;
        }
    }
}

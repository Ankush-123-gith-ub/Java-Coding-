interface SecurityUtils {
    static boolean isStrong(String pass) {
        return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*[0-9].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String p = "Hello123";
        System.out.println(SecurityUtils.isStrong(p) ? "Strong password" : "Weak password");
    }
}
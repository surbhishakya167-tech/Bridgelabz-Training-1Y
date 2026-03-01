public class PasswordApp {

    public static void main(String[] args) {

        String password = "Insurance123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
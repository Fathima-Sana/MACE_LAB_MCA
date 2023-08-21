import java.util.*;
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class UserAuthentication {
    private static final String VALID_USERNAME = "femy_elizabeth";
    private static final String VALID_PASSWORD = "hadessah";

    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid username or password.");
        } else {
            System.out.println("Authentication successful!");
        }
    }
}

class passwdexceptn {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String un;
            System.out.print("Enter Username:");
            un=sc.nextLine();
            String pswd;
            System.out.print("Enter Password");
            pswd=sc.nextLine();

            UserAuthentication.authenticate(un, pswd);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}

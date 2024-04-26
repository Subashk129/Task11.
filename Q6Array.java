package javaBasic.Task11;

import java.util.Scanner;

public class Q6Array {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // password
        String correctPassword = "Hello123";

        System.out.println("Login details");

        // username and password
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            // checking password
            authenticate (username, password, correctPassword);
            System.out.println("Login Successful");
            
        } catch (AuthenticationException e) {
            // authentication failure
            System.out.println("Error: Incorrect password!");
        }      
          sc.close();

        }

        // authenticate user
        public static void authenticate(String username, String password, String correctPassword) throws AuthenticationException {
            if (!password.equals(correctPassword)){
                // wrong password
                throw new AuthenticationException();
        
        }


    }
    
}
// Exception class for authentication failure
class AuthenticationException extends Exception {
    public AuthenticationException(){
        super("Incorrect password");

    }
}
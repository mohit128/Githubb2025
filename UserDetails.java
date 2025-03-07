import java.util.Scanner;

public class UserDetails {
    
    public static void main(String[] args) {
        
        String name = "Mohit";
        String address = "Delhi";
        String contact = "1234567890"; 
        String email = "budymohitsing@gmail.com";
        String password = "1234";
        String inputPassword;
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter your password: ");
        inputPassword = s.nextLine();   

        s.close();
    
    }

}

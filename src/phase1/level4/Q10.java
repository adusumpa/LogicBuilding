package phase1.level4;
//Take a password string and check basic rules (length ≥ 8 and contains at least one
//digit).

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        boolean check = false;
        if ((pass.length() >= 8)) {
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    check = true;
                    break;
                }
            }


            if (check) {
                System.out.println("valid password");
            } else {
                System.out.println("Password must contain at least one digit!");
            }
        }
        else{
            System.out.println("invalid password");
        }
    }
}

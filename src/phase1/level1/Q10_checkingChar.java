package phase1.level1;

import java.util.Scanner;

public class Q10_checkingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("The character is a upper case ");
        }else if(Character.isLowerCase(ch)){
            System.out.println("The character is a lower case ");
        }else if(Character.isDigit(ch)){
            System.out.println("The character is a digit ");
        }else{
            System.out.println("The character is a special character ");
        }
    }
}

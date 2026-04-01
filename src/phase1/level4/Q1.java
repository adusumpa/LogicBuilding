package phase1.level4;
import java.util.Scanner;

//Take a character and check if it is a letter, a digit, or neither
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println("character is a letter");
        }else if(Character.isDigit(ch)){
            System.out.println("character is digit");
        }else{
            System.out.println("character is not a number or Digit");
        }
    }
}

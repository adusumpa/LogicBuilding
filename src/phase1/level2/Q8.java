package phase1.level2;
//Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = sc.next().charAt(0);
      //  char ch1 = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch >= 'a' && ch <= 'm') {
                System.out.println("Alphabet Lies between a-m");
            } else {
                System.out.println("Alphabet Lies between n-z");
            }
        }else{
            System.out.println("Enter small a-z");
        }
    }
}

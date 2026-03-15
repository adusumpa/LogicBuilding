package phase1.level1;

import java.util.Scanner;
//. Take a character and check if it’s a vowel or consonant.
public class Q9_Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");

        char ch = Character.toLowerCase(sc.next().charAt(0));
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.print("Entered character is vowel");
        }else if(Character.isLetter(ch)){
            System.out.print("Entered a consonant");
        }else{
            System.out.print("Entered a non character");
        }
    }
}

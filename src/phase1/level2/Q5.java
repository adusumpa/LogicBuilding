package phase1.level2;

import java.util.Scanner;
//Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
//Evening”, or “Good Night”
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hour of the day: ");
        int a = sc.nextInt();
        sc.close();
        if(a>=0 && a<=23){
            if(a>=4 && a<=12){
                System.out.println("Good Morning");
            }else if(a>12 && a<=16){
                System.out.println("Good Afternoon");
            }else if(a>16 && a<=19){
                System.out.println("Good Evening");
            }else{
                System.out.println("Good Night");
            }
        }else{
            System.out.println("Invalid! Enter between 0-23");
        }
    }
}

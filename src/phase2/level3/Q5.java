package phase2.level3;
//LCM using loops
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for LCM");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int lcm = Math.max(a,b);
        while(lcm%a!=0 || lcm%b!=0){
                lcm++;
        }
        System.out.println("LCM = "+lcm);
    }
}

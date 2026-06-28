package phase2.level3;
//HCF (GCD) using loops
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for HCF");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int hcf = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                hcf= i;
            }
        }
        System.out.println(hcf);
    }
}

package phase2.level2;
//Print Fibonacci series up to n terms
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Fibonacci series up to n terms ");
        int n = sc.nextInt();
        sc.close();
        int a = 0 , b =1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int c= a+b;
            a=b;
            b=c;
        }
    }

}

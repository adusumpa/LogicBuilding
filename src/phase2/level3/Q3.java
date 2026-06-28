package phase2.level3;
// Numbers between a and b divisible by 7
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for(int i=a;i<=b;i++){
            if(i%7==0){
                System.out.println(i+" is divided by 7");
            }
        }
    }
}

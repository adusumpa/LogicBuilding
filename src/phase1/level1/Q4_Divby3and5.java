package phase1.level1;
import java.util.Scanner;
//DivisibleBy3And5
public class Q4_Divby3and5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        sc.close();
        if((x%3==0) && (x%5==0)){
            System.out.println("The number is divisible by 3 and 5");
        }else{
            System.out.println("The number is not divisible by 3 and 5");
        }

    }
}

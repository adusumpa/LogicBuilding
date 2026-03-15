package phase1.level3;
//Check if a number lies within the range [100, 999]
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        if(num>=100 && num<=999){
            System.out.println("The number lies within Range(100-999) ");
        }else{
            System.out.println("the number is not within range");
        }
    }
}

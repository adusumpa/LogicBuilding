package phase1.level4;

//Take three numbers and print the median value (neither maximum nor minimum)
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.close();
            if((a>b && a<c)||(a<b && a>c)){
                System.out.println(a +"is median");
            }else if((b>a && b<c)||(b<a && b>c)){
                System.out.println(b+"is median");
            }else{
                System.out.println(c+"is median");
            }

        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}

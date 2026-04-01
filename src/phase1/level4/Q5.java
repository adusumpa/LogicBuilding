package phase1.level4;
//Take income and age, and check if eligible for tax (age > 18 and income > 5 L)
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age and salary :");

        try{
            int age = sc.nextInt();
            long salary  = sc.nextLong();
            if(age>=0 && salary>=0 ){
                if(age>18 && salary>500000){
                    System.out.println("Eligible for Tax");
                }else{
                    System.out.println("Not Eligible for Tax");
                }
            }else{
                System.out.println("Enter positive numbers");
            }

        }catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}

package phase1.level2;
import java.util.Scanner;
//Take marks (0–100) and print the corresponding grade (A/B/C/D/F)
public class Q3_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int a = sc.nextInt();
        sc.close();

        if(a>=0 && a<=100){
            if(a>=85 && a<=100){
                System.out.print("The grade is A");
            }else if(a>=65 && a<=84){
                System.out.print("The grade is B");
            }else if(a>=55 && a<=64){
             System.out.print("The grade is C");
            }else if(a>=35 && a<=54){
                System.out.print("The grade is D");
            }else{
                System.out.print("The grade is F");
            }

        }else{
            System.out.println("Invalid marks: enter the value from 0 to 100 ");
        }
    }
}

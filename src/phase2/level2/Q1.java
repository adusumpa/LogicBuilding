package phase2.level2;
//Count the number of digits in a given number

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number");
            int count =0;
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("count is 1");
            }else{

                n = Math.abs(n);
                while(n>0){
                   n= n/10;
                    count++;
                }
                System.out.println("number of digits :"+count);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }


    }
}

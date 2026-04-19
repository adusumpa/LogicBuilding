package phase2.level2;
//Print all prime numbers between 1 and 100

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

      for(int i=2;i<=100;i++){
          boolean isPrime = true;
          for(int j=2;j*j<=1;j++){
              if(i%j==0){
                  isPrime =false;
                  break;
              }
          }
          if (isPrime)
              System.out.print(i + " ");
      }



    }
}

// Write a program that takes a number - say "n" from the user and prints the sum of first "n" natural numbers.
// If the user enters 0 or any -ve number as input, ask for the input again. Do this until the user enters a positive integer.
import java.util.Scanner;
public class Prob_22 {
    public static void main(String[] args) {
         Scanner SC = new Scanner(System.in);
         System.out.print(" Enter A Positive Number : ");
         int n = SC.nextInt();
         int sum = 0;
         while( 0 >= n){
         System.out.print("Please Enter A Positive Number : ");
         n = SC.nextInt();
         }
         
        for( int i = 1;  i<= n;i++){
          sum = sum + i;
        } 
        System.out.print(" The Sum Of First N Numbers : " + sum);
        SC.close();
    }
    
}

// "Write a program that takes a number as input and check -If the number is divisible by both 3 and 5, print ""FizzBuzz"".
// If it's divisible only by 3, print ""Fizz"". If it's divisible only by 5, print ""Buzz"". Otherwise, print ""ekta bhalo number de."""
import java.util.Scanner;
public class Prob_15 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter A Number : ");
    int Number = SC.nextInt();
    SC.close();
    if (Number % 3== 0 && Number % 5 ==0){
        System.out.print("FizzBuzz");
    }
    else if ( Number %3 ==0 ){
        System.out.println("Fizz");
    }
    else if(Number%5 ==0){
        System.out.println("Buzz");
    }
    else{
        System.out.print("ekta bhalo number de. ");
    }
}}

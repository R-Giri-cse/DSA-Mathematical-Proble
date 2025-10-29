// Write a program that takes a number from the user and prints the factorial of that number using do-while loop. 
// If the user enters a -ve number then print the message - "bhai, kya kar raha hai?".
//  Keep doing it until the user enters a +ve number.
import java.util.Scanner;
public class Prob_24 {
   public static void main(String[] args){
    Scanner SC = new Scanner(System.in);
    System.out.print("Entre a Number : ");
    int number = SC.nextInt();
    SC.close();
    while( number < 0){
        System.out.println("Bhai, Kya Kar Raha Hai ? ");
        number = SC.nextInt();
    }
    int Factorial = 1;
     int Temp_num = number;
    do{
        Factorial = Factorial * Temp_num;
        Temp_num--;
    }while(Temp_num >0);
    System.out.print(" The Factorial Of " +  number + " Is : " + Factorial +" . "); 
  }  
}

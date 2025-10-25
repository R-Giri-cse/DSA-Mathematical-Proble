//"Write a program that takes a number from the user and check - if the number is greater than 30, print ""I am creating list""
//if the number is less than 30 but greater than 20, print ""just joking"". if the number is less than 20 but greater than 7, print
//""hello world"". If the number is less than 7 print ""arghhh, this is annoying""."
import java.util.Scanner;
public class Prob_13 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter A Number : ");
    int Number = SC.nextInt();
    SC.close();
    if(Number > 30  ){System.out.print("I am creating list");}
    else if( 20 < Number && Number < 30 ){System.out.print("just joking");}
    else if(  7 < Number && Number < 20){System.out.print("hello world");}
    else{ System.out.print("arghhh, this is annoying");
}}
}

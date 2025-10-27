
// Write a java program that takes a number as input and displays its multiplication table upto 10.
import java.util.Scanner;
public class Prob_18 {
    public static void main(String[] args){
        Scanner SC = new Scanner( System.in);
        System.out.print("Enter a Number To Get A Multiplication Table  upto 10 : " );
        int number = SC.nextInt();
        SC.close();
        System.out.println("The Multiplication Table Of " + number +" Is : " );
        for( int i = 1;i<=10;i++){
            System.out.println( number +" * " +i + " = " + number*i );
        }
    }
    
}

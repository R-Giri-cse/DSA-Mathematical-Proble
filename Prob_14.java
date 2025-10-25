// "Write a program that takes 3 numbers from the user. If the first number is greater than the 3rd number, print the addition
// of the 3 numbers. If the 1st number is equal to the 2nd number, make 1st number equal to 3rd number and print the 
// message ""Kya struggle hai!"". Print the message ""question dhyan se padho""."
import java.util.Scanner;
public class Prob_14 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = SC.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = SC.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = SC.nextInt();
        SC.close();
        if( num1 > num3){
            int Addition = num1 + num2 +num3;
            System.out.println( "The Addition Of Three Numbers Is : "+ Addition );
        }
        if(num1 == num2)  {
            num1 = num3 ;
            System.out.print("Kya struggle hai!");
        }
        System.out.println("question dhyan se padho");
        System.out.println(" First Number = " + num1 +", Second Number = " +num2 + ", & Third Number = "+ num3 );
    }
}

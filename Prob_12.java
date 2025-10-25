// Write a program that takes a input from the user and then check if the number is greater than 10, print "I am awesome!".
//If the number is not greater than 10,print "I am one of a kind!". Regardless of the value, print "Testing your knowledge"
import java.util.Scanner;
public class Prob_12 {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number Here : ");
        int Number = SC.nextInt();
        SC.close();
        if ( Number > 10 ){
            System.out.print("I am Awesome!");
        }else {
        System.err.println("I am one of a kind");
        }
        System.out.print("Testing your knowledge ");

    }
}

// "write a program that takes the age of the user and his nationality. If the age >= 18 and nationality is ""Indian"", 
// print ""you can vote"". If the age is greater than or equal to 18 but nationality is not equal to ""Indian"", print 
// ""bhag yaha se, doosre desh mein ja"". If the age is not greater than 18, print ""abhi ghar jaa, bada ho ja, firr aana"""
import java.util.Scanner;
public class Prob_16{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = SC.nextInt();
        SC.nextLine();
        SC.close();
        System.out.print("Enter Your Nationlity : ");
        String Nationality = SC.nextLine().trim();
        if(age >= 18 ){
            if (Nationality.equalsIgnoreCase("Indian")) {
                System.out.println("you can vote");
            } else {
                System.out.println("bhag yaha se, doosre desh mein ja");
            }
        }
        else{
            System.out.println("abhi ghar jaa, bada ho ja, firr aana");
        }
    }
}

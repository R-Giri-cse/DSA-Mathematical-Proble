import java.util.Scanner;
public class Prob_4{
    //Write a program to take 2 numbers as input and swap the values of those 2 variables.
    public static void main(String[] args){
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int num1 = SC.nextInt();
     System.out.print("Enter Second Number : ");
    int num2 = SC.nextInt();
    SC.close();
    int  Temp = num1;
    num1 = num2;
    num2 = Temp;
    System.out.println(" After Swap The Numbers Are :- "+" First Number : "+ num1 +" , Second Numner : "+ num2);
    
    }
}
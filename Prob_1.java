import java.util.Scanner;
public class Prob_1{
    //"Write a Java program that accepts an integer (n) and prints it with the message ""Hello, you entered the number <input_number>"""
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in); 
        System.out.print("Enter Your  Number(n): ");
        int n = SC.nextInt();
        SC .close();
        System.out.print("Hello, You Entered The Nunber:" + n);
    }
}
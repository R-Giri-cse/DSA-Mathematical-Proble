import java.util.Scanner;
public class Prob_3{
   // Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter A  Number : ");
    int num = SC.nextInt();
    SC.close();
    int res = num +num*num +num*num*num;
    System.out.print("The Value of n + nn + nnn = " + res);
    }
}



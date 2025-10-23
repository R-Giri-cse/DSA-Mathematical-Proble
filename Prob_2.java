import java.util.Scanner;
public class Prob_2 {
    //Write a Java program that takes two numbers as input and displays the product of two numbers.
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int num1 = SC.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = SC.nextInt();
        SC.close();
        int Product = num1 * num2;
        System.out.print("The Product Of Two Numbers Is : "+ Product);

    }
}

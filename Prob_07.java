import java.util.Scanner;
public class Prob_7 {
  //  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        float num1 = SC.nextFloat();
        System.out.print("Enter Sceond Number  : ");
        float num2 =  SC.nextFloat();
        float addition = num1 + num2 ;
        float multiply = num1  * num2 ;
        float subtract = num1 - num2 ;
        float divide = num1 / num2;
        float remainder = num1 % num2;
        SC.close();
        System.out.println(" The Addition , Multiply , Subtract , Divide , Remainders  Are : -  " + addition +" , "+ multiply+" , "+ subtract+" , "+ divide +" , " +remainder+" . "  );

    }
}

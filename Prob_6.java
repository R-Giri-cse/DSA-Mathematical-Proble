import java.util.Scanner;
public class Prob_6 {
   //Write a program that takes the radius of a circle from user as input to print the area and perimeter of a circle.
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter The Redius Of A Circle : ");
        double redius = SC.nextDouble();
        double perimeter = 2*( 3.14159265 * redius);
         SC.close();
        System.out.println("The Perimeter Of The Circle Is : " + perimeter);
    }
}

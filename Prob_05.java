import java.util.Scanner;
public class Prob_5 {
    //Write a program that takes length and width of rectangle and then print the area and perimeter of a rectangle.
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter The  Length Of Ractangle : ");
        int length = SC.nextInt();
         System.out.print("Enter The Width Of Ractangle : ");
        int width = SC.nextInt();
        int perimeter = 2*(length + width);
        SC.close();
        System.out.println("The Perimeter Of The Rectangle Is : " +perimeter);

    }
}

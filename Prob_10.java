import java.util.Scanner;
public class Prob_10 {
  //  Write a program to take 2 integer values ( years and months ) for age of a person and calculate how many days he has lived. Use 365 days for each year and 30 days for each month. Print the age in number of days.
    public static void main(String[] args) {
         Scanner SC = new Scanner(System.in);
         System.out.print("Enter Number Of Years : ");
         int Years = SC.nextInt();
         System.out.print("Enter Number Of Months : ");
         int Months = SC.nextInt();
         function( Years , Months);
         SC.close();
    }
    public static void function( int Years , int Months ){
        int Days = ( Years * 365 )+ ( Months * 30);
        System.out.println(" My Age Is "+Years +" Years & "+ Months +" Months  So I lived  " +Days +" Days ." );

    }
}

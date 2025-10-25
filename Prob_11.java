// Write a program that takes the number of days a person as lived (i.e. his age)
// from the user and prints his age in years, months and days.
// Assume there are 365 days in 1 year and 30 days in 1 month.
import java.util.Scanner;
public class Prob_11{
    public static void main(String[] args){
     Scanner SC =  new Scanner(System.in);
     System.out.print(" Enter How Meny Days Are You Lived In This World : ");
     int Days = SC.nextInt();
     Function( Days);
     SC.close();
    }         
    public static void Function( int Days){
        int temp_days = Days;
         int Years = temp_days /365;
         temp_days = temp_days %365;
         int Months = temp_days/30;
         temp_days = temp_days%30;
         System.out.println("  If You Lived " +  Days + "  So You Lived In This Wotrld For "+ Years +" Years " + Months + " Months  & " + temp_days +"  Days ."  );

    }
  
}
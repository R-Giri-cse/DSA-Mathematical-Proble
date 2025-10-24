import java.util.Scanner;
public class Prob_9 {
    // Write a program which takes total number of seconds from the user and prints the number of hours, minutes and seconds
    public static void main(String[] args) {
        Scanner  SC = new  Scanner(System.in);
        System.out.print("Enter The NUmber Of Seconds : ");
        int Seconds = SC.nextInt();
        function( Seconds );
        SC.close();

    }
    public static void function( int Seconds ){
        int Temp_Seconds = Seconds; 
        int Hours = Temp_Seconds / 3600;
        Temp_Seconds = Temp_Seconds % 3600;
        int minutes =  Temp_Seconds / 60;
        Temp_Seconds = Temp_Seconds % 60;
        System.out.print(Seconds + " Seconds = "+ Hours +" Hours ,"+ minutes+" Minutes & "+ Temp_Seconds +" Seconds .");
    }                                  
}

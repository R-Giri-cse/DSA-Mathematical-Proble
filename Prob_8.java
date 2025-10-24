import java.util.Scanner;
public class Prob_8 {
    //"Write a program which takes number_of_hours and number_of_minutes as input from user and passes it to a function 
// which converts the hours and minutes to seconds."
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Number Of Hours : ");
        int hours = SC.nextInt();
        System.out.print("Enter Number Of Minutes : ");
        int minutes = SC.nextInt();
        fun( hours , minutes );
        SC.close();

    }
    public static void fun(  int hours ,  int minutes){
     int Seconds = (hours *3600) + (minutes * 60);
     System.out.print( hours +" Hours  & " + minutes +" Minutes = " + Seconds);

     
    }
}

// write a java program that prints the odd numbers between 9 and 48 using a while loop.
public class Prob_19 {
    public static void main(String[] args) {
        System.out.println( "dd Numbers From 9 To 48 Are :  ");
        int number = 9 ;
        while( number<=48){
            if( number % 2 != 0){
                System.out.println( number);
            }
            number++;
        }

    }
}

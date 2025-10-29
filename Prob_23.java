// Write a program that prints the factorial of number 7 using do while loop and while loop.

public class Prob_23 {
    public static void main(String[] args) {
        int number = 7;
        int factorial1 = 1; 
        do{
            factorial1 = factorial1 * number  ;
            number --;

        }while( number > 0 );
        number++;
        System.out.println(" The Factorial Of 7 Using Do-While Loop : " + factorial1 ) ;
        int factorial2 = 1; 
        while(number <=7){
            factorial2 = factorial2 * number  ;
            number ++;
        }
          System.out.println(" The Factorial Of 7 Using While Loop : " + factorial2 ) ;

    }
}

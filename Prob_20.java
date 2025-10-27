// write a program that prints the even numbers divisible by 4 between 7 and 78 using do-while loop.
public class Prob_20 {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Even  Numbers Divisible by 4  between 7 and 78 using do-while loop Are : ");
        do {
            if( number % 4 ==0  ){
            System.out.print( number +"  " );
            }
            number++;

        }while( number <= 78);
    }
    
}

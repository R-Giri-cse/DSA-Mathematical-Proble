// Write a program that prints the factors of the number 7832.
public class Prob_25 {
public static void main(String[] args) {
    int number = 7832;
    System.out.println(" The Factors Of 7832 Are : ");
    int Fact_Count=0;
    for( int i =1 ;i<=number;i++){
        if( number % i ==0){
            Fact_Count++;
            System.out.println(" Factor number " +Fact_Count+ " Is : "+ i +"." );
        }
    }
}    
}

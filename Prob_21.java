// Write a program that prints all the even numbers between 4 to 67 but skips any number which is multiple of 3.
public class Prob_21{
    public static void main(String[] args){
        System.out.print("All The Even Nmbers Betwee 4 To 67 But Skips Any Number Which Is Multiple Of 3 :  ");
        for( int i = 4;i <= 67; i++) {
            if( i % 3 != 0 && i % 2 != 0 ){
                System.out.print(i+ " ");
            }
        }
    }
}
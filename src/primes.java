import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        short number;
        System.out.println("Enter the number: ");
        number = check.nextShort();
        short i = 2;
        while( i < number) {
            short j = 2;
            while( j < i) {
                if( i % j == 0) {
                    break;
                } else {
                    j++;
                }
            }
            if( j == i){
                System.out.println(i);
            }
            i++;
        }
    }
}
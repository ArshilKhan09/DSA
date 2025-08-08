import java.util.Scanner;

public class LEC4 {
    // Input a Number and print whether it is prime or not 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

         boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // divisible by some number other than 1 and itself
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is NOT a Prime number");
        }
        sc.close();
    }
}
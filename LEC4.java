import java.util.Scanner;

public class LEC4 {
    // Input a Number and print whether it is prime or not 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

         if (number == number*1 && number == number*number ) {
            System.out.println(number+" is Prime Number ");
         }
         else {
            System.out.println(number+" is not a Prime Number ");
         }
        sc.close();
    }
}
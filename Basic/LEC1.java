package Basic;
import java.util.Scanner;

public class LEC1 {

    /*
     * Complete the function printNumber
     * which takes an integer input from the user and
     * prints it on the screen.
     */

    public static void main(String[] args) {
        printNumber();
    }

    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int input = sc.nextInt();
        System.out.println(input);
        sc.close();

    }
}

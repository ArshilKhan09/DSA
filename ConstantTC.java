import java.util.Scanner;

public class ConstantTC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numer : ");
        int n = input.nextInt();
        n *= (n+1)/2;
        System.out.println(n);
        input.close();
    }
}

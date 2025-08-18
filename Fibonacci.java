import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        System.out.print("Enter the Number to Find Fibonacci Series Of : ");
        int num = input.nextInt();

        if(num<=0){
            System.out.println("Invalid Number");
        }
        
        else{
        int start = 0;
        int end = 1 ;
            System.out.print(start+" ");
            System.out.print(end+" ");
        while (start+end<=num) {
            int curr = start+end ;
            start = end ;
            end = curr ;
            System.out.print(curr+" ");
        }
        }
       
       input.close();
    }
}

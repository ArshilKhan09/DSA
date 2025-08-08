import java.util.Scanner;

public class Pattern1 {
    /* Print the Pattern  

    SOLID RECTANGLE:-   
      * * * * *
      * * * * *
      * * * * *
      * * * * *
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int column = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
     }
}

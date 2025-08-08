import java.util.Scanner;

public class LEC2 {
    /*Given marks of a student, print on the screen:
    Grade A if marks >= 90
    Grade B if marks >= 70
    Grade C if marks >= 50
    Grade D if marks >= 35
    Fail, otherwise.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks of Student : ");
        int Marks = sc.nextInt();

        if (Marks >= 90 && Marks > 70) {
            System.out.println("Grade A");
        }
        else if (Marks >= 70 && Marks > 50){
            System.out.println("Grade B");
        }
        else if (Marks >= 50 && Marks > 35){
            System.out.println("Grade C");
        }
        else if (Marks >= 35 && Marks < 50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
    }

}

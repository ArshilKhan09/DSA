
import java.util.Scanner;

// O(n^2) Time Complexity of BubbleSort 
/* Why O(n²)?
    Outer loop runs (n-1) times → ~ n times.
    Inner loop runs (n-1), (n-2), (n-3)... 1 times.
*/
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
                
        System.out.print("Enter the "+n+" Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n-1 ; i++){   // Outer Loop 
            for(int j=0 ; j<n-i-1 ; j++){  // Inner Loop
                if(arr[j] > arr[j+1]){    // K (Constant operation that perform)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

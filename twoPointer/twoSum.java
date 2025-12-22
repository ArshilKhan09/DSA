import java.util.Arrays;

// Question return 2 Number from Array whose Sum is equal to Target without Creating an extra space 
// array is [7,2,5,1,3] 
// Target = 6
public class twoSum {
    public static void main(String[] args) {
    
        int[] arr = {7,2,5,1,3};
        // first we will sort the Array only if Question is asked to return Number Not Index
        // if thw question is asked to return Index then 2 pointer will not be used

        Arrays.sort(arr);
        System.out.print("Sorted Array is :");
        System.out.println(Arrays.toString(arr));

        findTarget(arr,12);
    }

     public static void findTarget(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(
                    "The numbers whose sum is " + target + " are : "
                    + arr[left] + ", " + arr[right]
                );
                return; 
            } 
            else if (sum < target) {
                left++; 
            } 
            else {
                right--; 
            }
        }

        System.out.println("There are no two numbers whose sum is " + target);
    }
}

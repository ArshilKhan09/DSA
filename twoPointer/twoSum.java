public class twoSum {
    public static void main(String[] args) {
       int[] nums = {3,2,4};
       int target = 6 ;

       Solution(nums, target);

    }
    public static void Solution(int[] nums , int target){
        int left = 0 ;
        int right = nums.length-1;

        while (left < right) {
            int sum = nums[left]+nums[right];

            if (sum == target) {
                return new int[] {nums[left] , nums[right]} ;
            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        
    }
}

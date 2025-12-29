public class sqSortArr {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10} ;

        int result[] = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        while (left<=right) {
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if (leftsq > rightsq) {
                result[index] = leftsq ;
                left++;
            }
            else{
                result[index] = rightsq ;
                right--;
            }
            index--;
        }

        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i]+" ");
        }
    }
}
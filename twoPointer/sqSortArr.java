public class sqSortArr {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10} ;

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = arr[i]*arr[i] ;
        }

        int left=0;
        int right=1;
        while (right < arr.length) {
            if (arr[left] > arr[right]) {
                left=right;
                right++ ;
            }
            else if(arr[left] < arr[right]){
                left++;
                right--;
            }
            else{
                right++;
            }
        }
        return arr;
    }
}
public class arrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[8] ;

            
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;
            arr[5]=60;
            arr[6]=70;

            System.out.println("Original Array :");
            System.out.println();
            for(int i = 0 ; i<arr.length ; i++){
                System.out.println(arr[i]);
            }
            
            
            System.out.println();

            //DISADVANTAGE

            //ARRAY CANNOT BE INSERT OR DELETE AT RANDOM LOCATION
            //IT CAN BE INSERT OR DELETE AT LAST 
            System.out.println("Updated Array :");
            System.out.println();
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=80;
            arr[4]=40;
            arr[5]=50;
            arr[6]=60;
            arr[7]=70;

            for(int i = 0 ; i<arr.length ; i++){
                System.out.println(arr[i]);
            }
    }
}

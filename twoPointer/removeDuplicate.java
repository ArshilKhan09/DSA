public class removeDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3};

        System.out.print("Original Array : ");
        for (int a : arr) {
            System.out.print(a+ " ");
        }
        System.out.println();

        int Uniquearr = Unique(arr);
        
        int i=0;
        int uni = 1;
        int j=1;
        
        System.out.print("Updated Array : ");
        for (int b : arr) {
            System.out.print(b+ " ");
        }
        System.out.println();

        
    }

    public static int Unique(int[] arr){
        int i=0;
        int uni = 1;
        int j=1;
        
        while (j<arr.length) {
            
        
            if (arr[j] == arr[j-1]) {
            j++;
            }        
            else {
            arr[i+1] = arr[j];
                i++;
                uni++;
                j++;
            }
        }
        return uni ;
    }
}


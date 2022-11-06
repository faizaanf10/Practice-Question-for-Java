import java.util.Arrays;

public class negative_one_side {
    public static void main(String[] args) {

         int[] arr= {-10, -45, 18, 26, -7, -10, 6, 99};
         negativeSort(arr);
         System.out.println(Arrays.toString(arr));
        
    }

    static void negativeSort(int[] arr){
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if(i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                j++;
            }
        }
    }
}

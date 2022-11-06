import java.util.Arrays;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 6, 8, 5, 5, 6, 3,2};
        // removeDuplicate(arr, 8);
        // System.out.println(Arrays.toString(arr));
        duplicateElements(arr);
    }


    static int removeDuplicate(int[] arr, int n){
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }


    //PRINTING THE DUPLICATE ELEMENTS

    static void duplicateElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

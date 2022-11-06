import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {

        int[] arr = {3, 5,4,1, 2, -4, 8, 11};
        int[] result = twoSum(arr, 2);
        System.out.println(Arrays.toString(result));

        
    }

    static int[] twoSum(int[] arr, int s){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + i; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    return new int[]{arr[i],arr[j]};

                }
            }
        }
        return null;
    }
}

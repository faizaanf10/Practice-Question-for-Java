public class ele_freq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,5,1,8,9,1,3,1};
        int frequency = freq(arr, 8);
        System.out.println("the frequency is " + frequency);
    }

    static int freq(int[] arr, int key){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                result ++;
            }
        }
        return result;
    }
}

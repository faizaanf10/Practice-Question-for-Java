
public class sort {
    public static void main(String[] args) {
        int[] arr = { 45, 56, 12, 89, 34 };
        arr_sort(arr,2);
    }

    static void arr_sort(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[key-1]);
    }
}

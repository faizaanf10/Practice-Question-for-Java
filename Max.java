import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(7);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(4);
        arr.add(9);

        System.out.println(arr);

        int result = maximum(arr);
        System.out.println(result);
    }

    static int maximum(ArrayList<Integer> arr){

        int max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        return max;

    }
}

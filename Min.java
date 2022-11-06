import java.util.ArrayList;

public class Min {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(21);
        arr.add(34);
        arr.add(56);
        arr.add(70);
        arr.add(43);
        arr.add(90);

       minimum(arr);
    }

    static void minimum(ArrayList<Integer> arr){

        int min = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        System.out.println(arr);
        System.out.println(min);

    }

    
}

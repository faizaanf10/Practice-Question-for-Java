import java.util.Scanner;

class fibo {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1, num3, count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("Fibonacci numbers upto " + n + ":" + 1);
        } else {
            System.out.println("Fibonacci sequence upto " + n);
            while (count < n) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                count += 1;
            }
            System.out.println("the term at position " + n + " is " + num1);
            int step = n - 1;
            System.out.println("the step count is " + step);
        }

        // for (int i = 0; i < count; ++i) {
        // num3 = num1 + num2;
        // System.out.print(" " + num3);
        // num1 = num2;
        // num2 = num3;
        // }
    }
}

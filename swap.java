class swap{
    public static void main(String[] args) {

        Swap(2,3);
        
    }

    static void Swap(int a, int b){
        System.out.println("before swapping a = " + a + "and b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping a = " + a + "and b = " + b );
    }
}
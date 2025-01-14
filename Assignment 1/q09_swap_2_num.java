public class q09_swap_2_num {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int t = b;
        b = a;
        a = t;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

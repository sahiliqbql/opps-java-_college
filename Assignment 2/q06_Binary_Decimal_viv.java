public class q06_Binary_Decimal_viv {

    public static void btd(int n) {
        int decimal = 0;
        int base = 1;
        while(n>0){
            int l = n%10;
            decimal += l*base;
            base = base*2;
            n = n/10;
        }
        System.out.println("decimal = "+decimal);
    }

    public static void dtb(int n){
        String binary = "";
        while(n>0){
            int d = n%2;
            binary+=d;
            n = n/10;
        }
        System.out.println(("binary = "+binary));
    }
    
    public static void main(String[] args) {
        btd(10101);
        dtb(123);
    }
}

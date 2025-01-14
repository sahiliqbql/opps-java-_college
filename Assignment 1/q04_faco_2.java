
public class q04_faco_2 {

    public static int fact(int n){
            if(n==1 || n==0){
                return 1;
            }
            return n = n*fact(n-1);
        }
        public static void main(String[] args) {
            int n = 5;
            int ans = fact(n);
        System.out.println(ans);
    }
}

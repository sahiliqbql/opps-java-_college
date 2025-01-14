
class fact {
    public void disp(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }
        System.out.println(ans);
    }
}

public class q05_fact_3_class {
    public static void main(String[] args) {
        fact ob = new fact();
        ob.disp(5);
    }
}

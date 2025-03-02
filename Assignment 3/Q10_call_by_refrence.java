
public class Q10_call_by_refrence {
    int p = 10;
    public static void modify(Q10_call_by_refrence ob){
        ob.p = 20;
    }
    public static void main(String[] args){
        Q10_call_by_refrence obj = new Q10_call_by_refrence();
        modify(obj);
        System.out.println(obj.p);
    }
}
 
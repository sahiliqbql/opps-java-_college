
// public class comand line args {
//     public static void main(String args[]) {
//         for (int i=0;i<args.length;i++){
//             System.out.println("args[" + i +"]" + args[i]);
//         }
//     }    
// }


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class q01_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);
    }
}

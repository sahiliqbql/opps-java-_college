
public class Q06_multiply_two_matrices {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},
                        {4,5,6}};

        int arr2[][] = {{1,2},
                        {3,4},
                        {5,6}};

        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int m2 = arr2.length;
        int n2 = arr2[0].length;

        int[][] ans = new int[m1][n2];

        if(n1==m2){
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    for (int k = 0; k < n1; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }else{
            System.out.println("Multiplication not possible");
        }
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

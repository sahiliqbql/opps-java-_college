public class Q04_sum_of_2_2d_arr {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6}};
        int arr2[][] = {{1,2,3},{4,5,6}};
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int m2 = arr2.length;
        int n2 = arr2[0].length;
        int[][] sum = new int[m1][n1];
        if(m1==m2 && n1==n2){
            for(int i=0; i<m1; i++){
                for(int j=0; j<n1; j++){
                    sum[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
        }else{
            System.out.println("sum not possible");
        }
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

public class Q05_sum_of_diagonal_elements_in_a_2D_array {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i][i];
        }
        System.out.println("sum = "+sum);
    }
}

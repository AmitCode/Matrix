import java.util.Scanner;

public class DifferenceBetweenSumOfDiagonal {
    public static int differenceOFDiagonalSum(int[][]array, int n){
        int d1=0,d2=0;
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    d1= d1 + array[i][j];
                }
                if(j == ((n-1)-i) )
                    d2 = d2 + array[i][j];
            }
        }
        return Math.abs(d1-d2);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Row and Columns of Matrix: ");
        int n = obj.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter the Elements of Matrix: ");
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                array[i][j] = obj.nextInt();
            }
        }

        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int result = differenceOFDiagonalSum(array,n);
        System.out.print("Sum is :" + result);
    }
}

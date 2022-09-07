import java.util.Scanner;

public class Multiplication {
    public static void multiply(int[][]a ,int[][]b, int n, int[][] c){
       for(int i=0; i<n;i++){
           for(int j=0; j<n;j++)
           {
               for(int k=0; k<n; k++)
                   c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
           }
       }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length(Row & Column): ");
        int n = obj.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the values in the first matrix: ");
        for(int i=0; i<n;i++)
            for(int j=0; j<n; j++)
                a[i][j] = obj.nextInt();
        System.out.println();
        int[][] b = new int[n][n];
        System.out.println("Enter the values in the first matrix: ");
        for(int i=0; i<n;i++)
            for(int j=0; j<n; j++)
                b[i][j] = obj.nextInt();
        int[][] c = new int[n][n];
        multiply(a,b,n,c);
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

    }
}

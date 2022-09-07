import java.util.Scanner;

public class SumOfAllElementOfMatrix {
        public static int sum(int[][] array, int row, int column){
                int sum = 0;
                for(int i=0;i<row; i++){
                        for(int j=0;j<column;j++){
                               sum = sum+ array[i][j];
                        }
                }
                return sum;
        }
        public static void main(String[] args) {
                Scanner obj = new Scanner(System.in);
                System.out.print("Enter the Row and Columns of Matrix: ");
                int row = obj.nextInt();
                int column = obj.nextInt();
                int[][] array = new int[row][column];
                System.out.println("Enter the Elements of Matrix: ");
                for(int i=0;i<row; i++){
                        for(int j=0;j<column;j++){
                                array[i][j] = obj.nextInt();
                        }
                }

                for(int i=0;i<row; i++){
                        for(int j=0;j<column;j++){
                                System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                }
                int sum = sum(array,row,column);
                System.out.print("Sum is :" + sum);
        }
}

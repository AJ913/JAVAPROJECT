package level1;

import java.util.Scanner;

public class twod_array_initialization_and_declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int i,j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

            for ( i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
        }
    }



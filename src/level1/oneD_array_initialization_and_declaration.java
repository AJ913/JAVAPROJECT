package level1;

import java.util.Scanner;

public class oneD_array_initialization_and_declaration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        System.out.println("The size of an array is :"+size);
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("The number of elements in an array is as follows:");
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }
}

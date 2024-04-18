package level1;

import java.util.Scanner;

public class sumandavgofanarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        System.out.println("The size of an array is :"+size);
        int sum[]=new int[size];
        for(int i=0;i<size;i++){
            sum[i]=sc.nextInt();
        }
        int s=0;
        int a=0;
        for(int i=0;i<size;i++){
            s=s+sum[i];
            a=s/(sum.length);
        }
        System.out.println(s);
        System.out.println(a);
        System.out.println();
    }
}

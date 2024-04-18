package challenge;

import java.util.Scanner;

public class challenge43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of a array:");
        int size= sc.nextInt();
        System.out.println("The size of an array is :"+size);
        int[] a =new int [size];
        for(int i =0;i<size;i++) {
            a[i] = sc.nextInt();
        }
        boolean isinc=isincreasing(a);
        boolean isdec=isdecreasing(a);
        if(isinc||isdec){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }
     public static boolean isincreasing(int a[]){
        for(int i =1;i<a.length;i++){
            if(a[i]>=a[i-1]){
                return false;
            }
        }
        return true;
        }
        public static boolean isdecreasing(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i] <= a[i-1]){
                return true;

            }
        }
        return false;
     }
}

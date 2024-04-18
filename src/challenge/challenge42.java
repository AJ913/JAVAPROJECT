package challenge;

import java.util.Scanner;

public class challenge42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a array:");
        int size = sc.nextInt();
        System.out.println("The size of an array is :" + size);
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (j > max) max = j;
        }
        for (int j : a) {
            if (j < min) min = j;
        }
        System.out.println("maximum" + max);
        System.out.println("minimum" + min);
    }
}
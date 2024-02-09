package challenge;

import java.util.Scanner;

public class challenge25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st value");
        int v1=sc.nextInt();
        System.out.println("bitwise right operation is:"+(v1>>1));
    }
}

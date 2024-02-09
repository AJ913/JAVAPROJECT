package challenge;

import java.util.Scanner;

public class challenge21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st value");
        int v1=sc.nextInt();
        System.out.println("Enter 2nd value");
        int v2=sc.nextInt();
        System.out.println("bitwise and operation is:"+(v1&v2));
    }
}

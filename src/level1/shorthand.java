package level1;

import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {


        int a = 5;
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        a = a + x1;//-----equation
        // we can write this equation as follows:
        a+=x1;

        System.out.println(a);
        int x2 = sc.nextInt();
        a = a + x2;
        System.out.println(a);
        int x3 = sc.nextInt();
        a = a + x3;
        System.out.println(a);
        int x4 = sc.nextInt();
        a = a + x4;
        System.out.println(a);

    }
}
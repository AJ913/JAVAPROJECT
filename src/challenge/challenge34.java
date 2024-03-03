package challenge;

import java.util.Scanner;

public class challenge34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        if (prime(num1)) {
            System.out.println("Its prime number");
        } else {
            System.out.println("Its not prime number ");
        }


    }

    public static boolean prime(int num1) {

        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}





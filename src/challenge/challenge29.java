package challenge;

import java.util.Scanner;

public class challenge29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i;
        int sum=0;
        for (i = 1; i <= n; i += 2) {
           sum+=i;
        }
        System.out.println(sum);
    }
}
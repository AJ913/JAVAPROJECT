package challenge;

import java.util.Scanner;

public class challenge32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number :");
        int first = sc.nextInt();
        System.out.println("Enter a  number :");
        int second = sc.nextInt();
        int result=lcm(first,second);
        System.out.println("THE lcm is:"+result);
    }


    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}


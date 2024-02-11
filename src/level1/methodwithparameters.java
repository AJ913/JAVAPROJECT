package level1;

import java.util.Scanner;

public class methodwithparameters {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int first = 0, second = 0;
            int result = sum2(first, second);
            System.out.println("Result=" + result);

        }
    }
    public static int sum2(int first,int second){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        first = sc.nextInt();
        System.out.println("Enter 2nd number:");
        second=sc.nextInt();
        return first+second;
    }
}

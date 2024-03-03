package challenge;

import java.util.Scanner;

public class challenge36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        fibonacci(num);

    }
    static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==1) return;
        System.out.print("1 ");
        int first=0, second=1;
        while(first+second<=num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
}

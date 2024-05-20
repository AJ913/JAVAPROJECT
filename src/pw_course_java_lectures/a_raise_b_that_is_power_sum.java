package pw_course_java_lectures;

import java.util.Scanner;

public class a_raise_b_that_is_power_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number acts as base");
        int a=sc.nextInt();
        System.out.println("Enter another number");
        int b= sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;

        }
        System.out.println("The answers is:"+ans);
    }
}

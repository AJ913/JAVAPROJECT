package pw_course_java_lectures;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int originalNumber=num;
        int ans=0;
        while(num>0){
            ans+=num%10;
            num=num/10;
        }
        System.out.println("sum_of_digits of number "+originalNumber+"is:"+ans);
    }
}

package pw_course_java_lectures;

import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int originalNumber=num;
        int reverse=0;
        while(num>0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        System.out.println("The reverse of the number "+originalNumber+"is:"+reverse);
    }
}

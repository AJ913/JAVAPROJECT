package pw_course_java_lectures;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        int originalNumber=num;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            System.out.println(fact);
        }
    }
}

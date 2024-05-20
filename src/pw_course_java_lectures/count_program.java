package pw_course_java_lectures;

import java.util.Scanner;

public class count_program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int count=0;
        int original_number=num;
        while(num>0){
            num =num/10;
            count++;
        }
        System.out.println("The number of digits in number " + original_number + " is:"+ count);
    }
}

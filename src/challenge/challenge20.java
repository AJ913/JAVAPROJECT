package challenge;

import java.util.Scanner;

public class challenge20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        if(age<13){
            System.out.println("YOUR A CHILD");
        }
        else if(age<20){
            System.out.println("YOUR A TEEN");
        }
        else if(age<=60){
            System.out.println("YOUR A ADULT");
        }
        else if(age>=60){
            System.out.println("YOUR A SENIOR");
        }
    }
}


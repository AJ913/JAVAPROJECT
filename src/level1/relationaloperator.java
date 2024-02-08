package level1;

import java.util.Scanner;

public class relationaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to driving licence portal");
        System.out.println("Please enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("YOUR ELEIGIBLE FOR APPLYING DRIVING LICENSE");
        }
        else{
            System.out.println("You are not eligible for applying driving license");

        }

    }
}

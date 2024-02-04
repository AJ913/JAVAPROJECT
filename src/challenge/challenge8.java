package challenge;

import java.util.Scanner;

public class challenge8 {
    public static void main(String[] args) {
        // create a program that takes two numbers and shows result of all arithmetic operators
        Scanner in = new Scanner(System.in);
         System.out.print("Enetr the value for number1:");
       int num1=in.nextInt();
        System.out.print("Eneter the value for number2:");
        int num2=in.nextInt();

        System.out.println("Sum ="+(num1+num2));
        System.out.println("subtraction ="+(num1-num2));
        System.out.println("multiplication ="+(num1*num2));
        System.out.println("division ="+(num1/num2));
        System.out.println("modulo="+(num1%num2));

    }
}

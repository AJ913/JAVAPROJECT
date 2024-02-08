package challenge;

import java.util.Scanner;

public class challenge17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:" );
        int num1=sc.nextInt();
        System.out.println("Enter number 2:" );
        int num2=sc.nextInt();
        System.out.println("Enter number 3:" );
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("NUMBER "+num1+"\tIS GREATER THAN\t"+num2+"\tAND\t"+num3);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("NUMBER "+num2+"\tis GREATER THAN \t"+num1+"\tAND\t"+num3);
        }
        else if (num3>num1 && num3>num2){
            System.out.println("NUMBER "+num3+"\tIS GREATER THAN\t"+num1+"\tAND\t"+num2);
        }

    }
}

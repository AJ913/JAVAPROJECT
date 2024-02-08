package challenge;

import java.util.Scanner;

public class challenge15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num1=sc.nextInt();
        if(num1>0){
            System.out.println("Positive Number");
        }
        else if(num1<0){
            System.out.println("Negative Number");
        }
        else if (num1==0){
            System.out.println("Zero");
        }
    }
}

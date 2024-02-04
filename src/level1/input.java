package level1;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("enter your name:");
        String n=sc.nextLine();
        System.out.println("My name is "+n);
        System.out.print("Also Tell Your Age:");
        int a=sc.nextInt();
        System.out.println("My Age is :"+a);
    }
}

package level1;

import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to discount calculator");
        System.out.println("please enter your age:");
        int age=sc.nextInt();
        System.out.println("ARE YOU FEMALE?(true/false");
        boolean isFemale=sc.nextBoolean();
        if(age<5){
            System.out.println("You got 75% discount");
        }
        else if(isFemale){
            System.out.println("You got 50% discuont ");

        }
        else if(age>60 && !isFemale){
            System.out.println("YOU got 25% discount ");
        }
        else {
            System.out.println("you got no discount");
        }
    }
}

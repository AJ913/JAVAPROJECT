package challenge;

import java.util.Scanner;

public class challenge38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean isPalindrome=isPalindrom(num);
        if(isPalindrome){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
    }

    public static boolean isPalindrom(int num) {
        int rem=0;
        int i=-1;
        int Originalnumber=num;
        int digit=0;
        while(num>=i){
            rem=num%10;
            digit=digit*10+rem;
            num=num/10;
            i++;
        }
        return Originalnumber==digit;

    }
}

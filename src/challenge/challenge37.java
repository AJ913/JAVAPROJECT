package challenge;

import java.util.Scanner;

public class challenge37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();
        boolean isArmstrong=isArmstrong((int) num);
        if (isArmstrong) {
            System.out.println("THis number is armstrong numbeR");
        } else {
            System.out.println("THis number is not armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int numberofdigits=noofDigits(num);
        int finalnumbers=0;
        int numcopy=num;
        while(num>0){
            int lastdigit=num%10;
            num=num/10;
            finalnumbers=finalnumbers+pow(lastdigit,numberofdigits);
        }
        return finalnumbers==numcopy;
    }
    public static int noofDigits(int num){
        int digits=0;
        while(num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }

    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(num2>i){
            result=result*num1;
            i++;
        }
        return result;
    }


}




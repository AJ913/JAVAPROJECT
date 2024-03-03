package challenge;

import java.util.Scanner;

public class challenge35  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number:");
        int num=sc.nextInt();
        int result=reverse(num);
        System.out.println("The reverse of the number is :"+result);
    }
    static int reverse(int num){
        int nd=0;
       while(num>0){
           int d=num%10;
           nd=10*nd+d;
            num=num/10;
       }
       return nd;

    }
}

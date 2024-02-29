package challenge;

import java.util.Scanner;

public class challenge31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=-1;i<=num;i++){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);

    }

}

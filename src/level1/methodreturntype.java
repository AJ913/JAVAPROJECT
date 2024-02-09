package level1;

import java.util.Scanner;

public class methodreturntype {
    public static void main(String[] args) {
        int result=sum();
        System.out.print("The sum of two numbers:"+result);
          }
    public static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int num1=sc.nextInt();
        System.out.println("ENTER 2nd NUMBER:");
        int num2=sc.nextInt();
        int sum2=num1+num2;
        return sum2;


    }
}

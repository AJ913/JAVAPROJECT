package challenge;

import java.util.Scanner;

public class challenge30 {
    public static void main(String[] args) {
        int num=factRead();

        int mul=1;
        for(int i=1;i<=num;i++){
           mul*=i;

        }
        System.out.println(mul);

    }
    public static int factRead(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        return num;

        }
}

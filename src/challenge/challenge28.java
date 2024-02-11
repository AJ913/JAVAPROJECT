package challenge;

import java.util.Scanner;

public class challenge28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values to be multiplied:");
        int n=sc.nextInt();
        System.out.println("Enter a constant which is been multiplied:");
        int m=sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(m+"*"+i+"="+(m*i));
        }
    }
}

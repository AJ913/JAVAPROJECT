package challenge;

import java.util.Scanner;

public class challenge39b {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number:");
        int n =sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();

        }

    }
}

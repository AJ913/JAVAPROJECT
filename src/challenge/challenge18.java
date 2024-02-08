package challenge;

import java.util.Scanner;

public class challenge18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the year");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("The year"+year+" a leap year");
        }
        else{
            System.out.println("The year"+year+"is not a leap year");
        }
    }
}

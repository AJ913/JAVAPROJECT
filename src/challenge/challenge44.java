package challenge;

import level1.OCCURANCEARRAY;

import java.util.Scanner;

public class challenge44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to array element deletion");
        int [] numarr=ArrayUtillity.inputArray();
        System.out.println("Now enter the numbers you want to delete:");
        int numToDelete=sc.nextInt();
        int [] newArr = deleteNumber(numarr,numToDelete);
    }

    public static int[] deleteNumber(int[] numarr, int numToDelete) {
    

    }
}

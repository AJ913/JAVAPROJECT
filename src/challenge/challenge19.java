package challenge;

import java.util.Scanner;

public class challenge19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        double marks= sc.nextDouble();
        if(marks>90){
            System.out.println('A'+"--> MARKS IS ABOVE 90");
        } else if (marks>75 && marks<90) {
            System.out.println('B'+"--> MARKS IS ABOVE 75");
        } else if (marks>60 && marks<75) {
            System.out.println('C'+"--> MARKS IS ABOVE 60");
        } else if (marks>30 && marks<60) {
            System.out.println('D'+"--> MARKS IS ABOVE 30");
        } else if (marks<30) {
            System.out.println('F'+"--> MARKS IS BELOW 30");

        }

    }
}

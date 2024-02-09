package level1;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
//     int num=0;
//     while(num<10000){
//         num+=1;
//         System.out.println(num);
//     }
//     int num2=200;
//     while(num2>0){
//         num2-=1;
//         System.out.println(num2);
//     }
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<5){
            int in=sc.nextInt();
            int i1=i++;
            System.out.println("Number is:"+i1);
        }
    }
}

package level1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result=sum(num);
        System.out.println(result);

    }


    static int sum(int num){
        int sum=0;
        for(int i=0;i<= num;i++){
            sum=sum+num%10;
            num=num/10;
            i++;
        }
        return sum;
    }
}

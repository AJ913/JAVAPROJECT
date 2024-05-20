package pw_course_java_lectures;

import java.util.Scanner;

public class odd_add_and_even_subtract_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int num=sc.nextInt();
        int originalNumber=num;
        int ans=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                ans-=i;
            }
            else{
                ans+=i;
            }
        }
        System.out.println("The answers of the series of given number"+originalNumber+"is:"+ans);
    }
}

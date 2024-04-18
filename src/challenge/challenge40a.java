package challenge;

import java.util.Scanner;

public class challenge40a {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter tge number of elements :");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Please enter the number of elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        long sum=sum(a);
        System.out.println(sum);

    }

    public static long sum(int a[]){
        int sum=0;
        int i=0;
        while(i<a.length){
            sum+=a[i];
            i++;
        }
        return sum;
    }
}

package level1;

import java.util.Scanner;

public class OCCURANCEARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of an array:");
        int size= sc.nextInt();
        System.out.println("The size of array is :"+size);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("The enterd number is:"+num);
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<size;i++){

                if(arr[i]==num){
                    count++;
                }
            }
        System.out.println("THE number of time the number is repeted is :"+count);
        System.out.println();
        }
    }


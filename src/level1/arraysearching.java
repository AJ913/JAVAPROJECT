package level1;

import java.util.Scanner;

public class arraysearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,6,8,87,65,4,68,23,9,98,34};
        System.out.println("Enter the number u want to search");
        int num =sc.nextInt();
        boolean isfound=isfound(arr,num);
        if(isfound){
            System.out.println("Your number is found");
        }
        else {
            System.out.println("Your number is not found ");
        }
    }
    public static boolean isfound(int[]arr,int num){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }

}

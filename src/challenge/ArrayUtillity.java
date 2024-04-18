package challenge;

import java.util.Scanner;

public class ArrayUtillity {
    public static int [] inputArray() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        System.out.println("The size of an array is :"+size);
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Please enter the element number"+(i+1)+":");
            nums[i]=sc.nextInt();

        }
        return nums;
    }
    public static void displayArray(int [] numArray){
        for(int i =0;i< numArray.length;i++){
            System.out.println(numArray[i]+" ");
        }
        System.out.println();
    }
}

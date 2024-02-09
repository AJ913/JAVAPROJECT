package level1;

import java.util.Scanner;

public class methodwithreturntypeefficientely {
    public static void main(String[] args) {
       int first=readValue();
       int second=readValue();
        System.out.println("The Sum="+(first+second));
    }
    public static int readValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER  NUMBER:");
        int i = sc.nextInt();
        return i;
        
    }

}

package challenge;

import java.util.Scanner;

public class challenge33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int first = sc.nextInt();
        System.out.println("Enter 1st number:");
        int second = sc.nextInt();
        int result = gcd(first, second);
        System.out.println("The result:" + result);

    }

    static int gcd(int first, int second) {
        int least = least( first ,second);
        int i ;
        int gcd=1;
        for(i=2;i<=least;i++){
            if(first%i==0  && second%i==0){
                gcd=i;
            }
        }
        return gcd;

    }

   static int least(int first, int second){
        if(first > second){
           return second;
        }
        else{
            return first;
        }
   }
}

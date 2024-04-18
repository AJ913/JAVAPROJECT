package challenge;

public class challenge41 {
    public static void main(String[] args) {
        int n=2;
        int arr[]={2,3,2,3,4,2};
        int i=0;
        int occ=0;
        while(i<arr.length){
            if(n==arr[i]){
                occ++;

            }
            i++;
        }
        System.out.println("Number repeted "+occ+"times");
    }
}


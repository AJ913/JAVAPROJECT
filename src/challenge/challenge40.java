package challenge;

public class challenge40 {
    public static void main(String[] args) {
        double arr[]={1,2,3,4};
        double i=0,sum=0,avg=0;int index=0;
        while(i<arr.length){
            sum=sum+arr[index];
            avg=((sum)/(arr.length));
            index++;
            i++;
        }
        System.out.println("Sum="+sum);
        System.out.println("avg="+avg);


    }
}

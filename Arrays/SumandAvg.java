package Arrays;

import java.util.Scanner;

public class SumandAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        float avg=sum/size;
        System.out.println("Sum of array : "+sum);
        System.out.println("Average of an array  : "+avg);
        sc.close();
    }
}

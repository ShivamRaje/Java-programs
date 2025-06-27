package Arrays;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array   : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        sc.close();
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
       
        Arrays.sort(arr);
        int[] temp= new int[size];
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++] = arr[size - 1];
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}

package DSA.leetcode;

import java.util.Scanner;

public class SubArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        

        sc.close();
    }
}

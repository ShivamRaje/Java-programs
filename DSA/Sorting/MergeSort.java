package DSA.Sorting;

import java.util.Scanner;

public class MergeSort {
    //perform sorting
    public  static void divide(int[] arr) {
        

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter array size : ");
    int size = sc.nextInt();
    System.out.println("Enter array elements : ");
    int[] arr=new int[size];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    divide(arr);
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();


    }
}

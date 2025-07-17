package DSA.Sorting;

import java.util.Scanner;

public class InsertionSort {
    //perform sorting
    private static void insertsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;.
            }
            
        }

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
    insertsort(arr);
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();


    }
}

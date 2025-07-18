package DSA.Sorting;

import java.util.Scanner;

public class MergeSort {
    //perform sorting
    public  static void conquer(int[] arr,int si,int mid,int ri) {
        int[] merge=new int[si+ri-1];
        int left=si;
        int mi=mid+1;

    }
    public  static void divide(int[] arr,int si,int ri) {
        if(si>=ri){
            return;
        }
        int mid=si+(ri-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1,ri);
        conquer(arr,si,mid,ri);

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
    divide(arr,0,size-1);
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();


    }
}

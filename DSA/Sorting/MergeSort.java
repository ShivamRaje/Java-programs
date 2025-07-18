package DSA.Sorting;

import java.util.Scanner;

public class MergeSort {
    //perform sorting
    public  static void conquer(int[] arr,int si,int mid,int ri) {
        int[] merge=new int[ri-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=ri) {
            if (arr[idx1]<=arr[idx2]) {
                merge[x++]=arr[idx1++];
            } else {
                merge[x++]=arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
    
        while (idx2 <= ri) {
            merge[x++] = arr[idx2++];
        }
    
        // Copy merged array back to original array
        for (int i = 0; i < merge.length; i++) {
            arr[si + i] = merge[i];
        }
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

package DSA.Sorting;

import java.util.Scanner;

public class SelectionSort {
    //perform sorting
    private static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[current]>arr[j]){
                    current=j;
                }
            }
            int temp=arr[current];
            arr[current]=arr[i];
            arr[i]=temp;
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
    sorting(arr);
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    
    
        }
    
        
    
    
}

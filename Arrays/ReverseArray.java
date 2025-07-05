

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse of an array : ");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

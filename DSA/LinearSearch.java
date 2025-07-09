package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean status=false;
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter key to find : ");
        int key =sc.nextInt();
         for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key found.");
                status=true;
                break; 
            }
         }
         if(!status){
            System.out.println("Key not Found.");
         }
        sc.close();
    }
}

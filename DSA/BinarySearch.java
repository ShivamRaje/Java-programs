package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void findKey(int arr[],int left,int right,int key){
        int mid=left+(right-left)/2;
        boolean status=false;
        for(int i=0;i<arr.length;i++){
            if (arr[mid]==key) {
                System.out.println("Key found at index ");
                status=true;
                break;
            }else if(arr[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(!status){
            System.err.println("key not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter key to find : ");
        int key=sc.nextInt();
        findKey(arr,0,size-1,key);

        sc.close();
    }
}

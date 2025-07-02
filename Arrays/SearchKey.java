package Arrays;

import java.util.Scanner;

public class SearchKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found=false;
    System.out.println("Enter size of an array : ");
    int size=sc.nextInt();
    System.out.println("Enter array elements : ");
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter Key : ");
    int key=sc.nextInt();
    for (int i = 0; i < arr.length-1; i++) {
       if (arr[i]==key) {
        System.out.println("Key found at index : "+i);
        found=true;
        break;
       }
    }
    if (!found) {
        System.out.println("Key not found");
    }
    
    sc.close();
    }
    

}

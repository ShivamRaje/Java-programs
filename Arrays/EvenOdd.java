package Arrays;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array   : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println ("Even : "+arr[i]);
            }
          
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println("Odd : "+arr[i]);
            }
          
        }
       
        sc.close();
    }
}

import java.util.Scanner;

public class LuckNumberArray {
    public static int findLuckyNumber(int[] arr) {
      int[] cnn= new int[500];
      for(int x:arr){
        ++cnn[x];
      }
      for(int x=cnn.length-1;x>0;x--){
            if(x==cnn[x]){
                return x;
            }
      }
      return -1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int result=findLuckyNumber(arr);
        System.out.println("Lucky number : "+result);
                sc.close();
     }    
}

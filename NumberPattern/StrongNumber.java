import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int dup1=num,sum=0;
        while (dup1!=0) {
            int rem=dup1%10;
            int fact=1;
            for (int i = 1; i<=rem; i++) {
                fact*=i;
               
            }
            sum=sum+fact;
            dup1/=10;
        }
        if (num==sum) {
            System.out.println("Given number is Strong Number.");
        } else {
            System.out.println("Not a strong number.");   
        }
        sc.close();
    }
}
//1,2,145,40585.

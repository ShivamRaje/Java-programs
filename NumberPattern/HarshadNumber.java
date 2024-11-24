import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int dup1=num;
        int sum=0;
        while(dup1!=0){
            int rem=dup1%10;
            sum+=rem;
            dup1/=10;
        }
        if (num%sum==0) {
            System.out.println("It is an Harshad Number.");
        } else {
            System.out.println("It is not an Harshad Number.");
        }
        sc.close();
    }
}
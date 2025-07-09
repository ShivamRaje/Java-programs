import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int dup1=num;
        int dup2=num;
        int add=0;
        int mul=1;
        while (dup1!=0) {
            int rem=dup1%10;
            add+=rem;
            dup1/=10;
        }
        while (dup2!=0) {
            int rem=dup2%10;
            mul*=rem;
            dup2/=10;
        }
        if (mul==add) {
            System.out.println("It is an Spy Number.");
        }
        else{
            System.out.println("It is not an Spy Number.");
        }
        sc.close();
    }
}
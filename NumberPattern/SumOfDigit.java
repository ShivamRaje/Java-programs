import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int dup=num;
        int sum=0;
        while (dup!=0) {
            int rem=dup%10;
            sum+=rem;
            dup/=10;
        }
       System.out.println("Sum of the given number "+num+" is : "+sum);
        sc.close();
    }
}

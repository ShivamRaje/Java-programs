import java.util.Scanner;

public class KaprekarNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        // num=45;
        int square=num*num;
        //2025
        int dup1=num;
        int len=0;
        int sum=0;
        while(dup1!=0){
            len++;
            dup1/=10;
        }
        
        int divisor=(int)Math.pow(10, len);
        // 10^2=100;

        int rightPart = square % divisor;
        // 2025%100=25;
        int leftPart = square / divisor;
        // 2025/100=20;

        sum=leftPart+rightPart;
        if (sum==num) {
            System.out.println("It is an Kaprekar Number.");
        } else {
            System.out.println("It is not  an Kaprekar Number.");
        }
        sc.close();

    }
}
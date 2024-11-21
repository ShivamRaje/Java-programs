import java.util.Scanner;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("The first "+num+" terms are : ");
        for (int i = 0; i < num; i++) {
            System.out.print (a+" ");
            int sum=a+b;
            a=b;
            b=sum;
            
        }
        sc.close();
    }
}

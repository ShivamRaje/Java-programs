import java.util.Scanner;

public class SwapTwonumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Before swap  a = ");
        int a =sc.nextInt();
        System.out.println("Before swpa  b = ");
        int b= sc.nextInt();

        //First Method
        //Using Third variable
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("After swap a = "+a);
        // System.out.println("After swap b = "+b);

         //Second Method
        //Using no third  variable
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("After swap a = "+a);
        // System.out.println("After swap b = "+b);

        //Third Method
        //Using no third  variable with xor
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a = "+a);
        System.out.println("After swap b = "+b);
        sc.close();
    }
}
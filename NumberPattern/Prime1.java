import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        boolean flag=false;
        // if (num==1) {
        //     System.out.println("Number is prime");
        // }
        for (int i = 2; i<num; i++) {
            if (num%i==0) {
               flag=true;
               break;
            } 
        }
        if (flag==false) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not  prime");
        }
        sc.close();
    }
}

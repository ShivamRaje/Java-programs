import java.util.Scanner;

public class PerfectNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int sum=0;
        for (int i = 1; i<num; i++) {
            if (num%i==0) {
                sum=sum+i;
            }
        }
        if (sum==num) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
        
        sc.close();
    }
}
//perfect numbers : 6,28,496

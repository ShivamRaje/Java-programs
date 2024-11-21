import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int square=num*num;
        int numrem=num%10;
        int rem=square%10;
        if (numrem==rem) {
            System.out.println("Number is Automorphic.");
        } else {
            System.out.println("Number is not Automorphic.");
        }
        sc.close();
    }
}
//5,6,25,76,376

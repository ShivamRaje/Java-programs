package NumberPattern;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        int dup1=n, dup2=n,rev=0,len=0;
        while (dup1 != 0) {
            dup1/=10;
            len++;
        }
        for (int i = 1; i <=len; i++) {
            int sum=dup2%10;
            rev=sum+rev*10;
            dup2/=10;
        }
        if (rev==n) {
            System.out.println("Number is Plaindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
    
}

package StarPattern;

import java.util.Scanner;

public class NormalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
}

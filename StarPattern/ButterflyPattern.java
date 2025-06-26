package StarPattern;

import java.util.Scanner;

public class ButterflyPattern {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    //Take input from user 
    int n=sc.nextInt();
    int n1=n+n;
    //upper part
    for (int i = 0; i<n; i++) {
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");
        }
        for(int j=n1-i*2;j>1;j--){
            System.out.print(" ");
        }
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //lower part 
    for (int i = n-2; i>=0; i--) {
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");
        }
        for(int j=n1-i*2;j>1;j--){
            System.out.print(" ");
        }
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
   }
}

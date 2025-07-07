package StarPattern;

import java.util.Scanner;

public class FloydTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of Floy'd Triangle: ");
        int n=sc.nextInt();
        int count=1;
        System.out.println("");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}

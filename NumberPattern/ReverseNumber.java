import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int dup1=num,dup2=num,len=0;
        int rev=0;
        while (dup1!=0) {
            dup1/=10;
            len++;
        }
        for (int i = 0; i <len; i++) {
            int rem=dup2%10;
            rev=rem+rev*10;
            dup2/=10;
        }
        System.out.println("Reverse of a "+num+" is : "+rev);
        sc.close();
    }
}

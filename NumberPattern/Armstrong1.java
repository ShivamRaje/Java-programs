import java.util.Scanner;

class Armstrong1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int dup1=num,dup2=num,sum=0,len=0;
        while(dup1!=0){
            dup1/=10;
            len++;
        }
        while (dup2 != 0) {
            int rem = dup2 % 10;
            int power = 1;
            for (int i = 0; i < len; i++) {
                power *= rem;
            }
            sum += power;
            dup2 /= 10;
        }
        if (num==sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }

        
        sc.close();
    }
}
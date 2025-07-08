import java.util.Scanner;

public class SpeedCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter distance ( in Kms ) : ");
        int dis=sc.nextInt();
        System.out.println("Enter time (in hrs) : ");
        int hrs=sc.nextInt();
        int speed=dis/hrs;
        System.out.println("Speed is "+speed+" (Km/hr) ");
        sc.close();
    }
}

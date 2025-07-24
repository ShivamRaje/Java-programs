import java.util.Scanner;

public class ReplaceStrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your String : ");
        String s1=sc.nextLine();
       
        System.out.println("Enter String that you want to replace : ");
        String s2=sc.nextLine();
        System.out.println("Enter String that you want to replace with :  ");
        String s3=sc.nextLine();
        String replaceStringAll=s1.replaceAll(s2, s3);
        System.out.println(replaceStringAll);
        sc.close();
    }
}

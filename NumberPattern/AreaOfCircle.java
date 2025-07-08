import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circcle : ");
        double n=sc.nextDouble();
        double area=3.14*n*n;
        System.out.println("Area of the circle : "+area);


        sc.close(); 
    }
}

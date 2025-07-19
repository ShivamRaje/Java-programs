import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        //Take input from user
        Scanner sc = new Scanner(System.in);
        //Enter breadth
        System.out.print("Enter breadth : ");
        int breadth=sc.nextInt();
        //Enter height
        System.out.print("Enter height : ");
        int height=sc.nextInt();
        //Calculate area 
        float area=(breadth*height)/2;

        System.out.println("Area of Traingle : "+area);
        sc.close();
    }
}

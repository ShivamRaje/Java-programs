import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s1=sc.nextLine();
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w)
        }
        sc.close();
    }
}

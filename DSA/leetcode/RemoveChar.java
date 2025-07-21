package DSA.leetcode;

import java.util.Scanner;

public class RemoveChar {
    public static String removeC(String s){
        StringBuilder sb= new StringBuilder(s);
        int count=1;
        for (int i = 1; i <s.length(); i++) {
            if (s.charAt(i)==s.charAt(i-1)) {
                count++;
            } else {
                count=1;
            }
            if (count<3) {
                sb.append(s.charAt(i));
            }
        }
        return s.length() > 0 ? s.charAt(0) + sb.toString() : "";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.nextLine();
        sc.nextLine();
        String newS=removeC(s);
        System.out.println(newS);
        sc.close();
    }
}

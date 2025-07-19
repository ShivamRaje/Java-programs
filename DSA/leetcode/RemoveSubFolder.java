package DSA.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveSubFolder {
    public static void removeSubFolder(String[] folder){
        Arrays.sort(folder);
        List<String> ans=new ArrayList<>();
        ans.add(folder[0]);

        for(int i=1;i<folder.length;i++){
            int m=ans.get(ans.size()-1).length();
            int n=folder[i].length();
            if(m>=n
            || !(ans.get(ans.size()-1).equals(folder[i].substring(0,m))
            && folder[i].charAt(m)=='/')){
                ans.add(folder[i]);
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter folders: ");
        String[] folder=new String[size];
        for (int i = 0; i < folder.length; i++) {
            folder[i]=sc.nextLine();
        }
        removeSubFolder(folder);
        sc.close();
    }
}
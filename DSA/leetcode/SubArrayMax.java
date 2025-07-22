package DSA.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayMax {
    public static int maximumUniqueSubarray(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int left = 0, sum = 0, max = 0;
            for(int right=0;right<nums.length;right++){
                while (set.contains(nums[right])) {
                    set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }
                set.add(nums[right]);
                sum+=nums[right];
    
                max=Math.max(max,sum);
            }
            return max;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an array : ");
            int size=sc.nextInt();
            System.out.println("Enter array elements : ");
            int[] arr= new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            int output=maximumUniqueSubarray(arr);
            System.out.println("Output : "+output);

        sc.close();
    }
}

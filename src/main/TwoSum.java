package main;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {2, 7, 8, 1, 5, 6, 4, 3};
        int target = scan.nextInt();
        int[] twoNums = getTwoSum(nums, target);
        System.out.println(Arrays.toString(twoNums));
    }

    private static int[] getTwoSum(int[] nums, int target) {
        int arrLength = nums.length;
        int[] twoNums = new int[2];
        loop:
        for(int i = 0; i < arrLength; i++) {
            for(int j = i + 1; j < arrLength; j++) {
                if(nums[i] + nums[j] == target) {
                    twoNums[0] = i;
                    twoNums[1] = j;
                    break loop;
                }
            }
        }
        return twoNums;
    }
}

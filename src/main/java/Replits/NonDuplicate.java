package Replits;

import java.util.Scanner;

public class NonDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3, 4, 1};

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(nums[i]);
            }
        }

    }
}

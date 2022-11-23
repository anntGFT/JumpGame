package org.example;

public class Solution {
    public Solution(){

    }

    public boolean canJump(int[] nums) {

        int jumps = 0;

        if (nums.length == 1){

            return true;
        }

        for (int i = 0; i < nums.length; i++){

            if (jumps <= nums[i]){

                jumps = nums[i];
            }else{

                jumps--;
            }

            if (jumps == 0 && i != nums.length - 1){

                return false;
            }
        }

        return true;
    }
}
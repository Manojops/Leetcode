/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] twoSum(int[] nums,int target){
        //Create a HashMap to Store the Complement
        Map<Integer,Integer> map=new HashMap<>();

        //Iterate the Entire array
        for (int i = 0; i < nums.length; i++) {
            //Generate complement value
            int complement=target-nums[i];

            //check if the complement present in the nums[] or not
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }

            //Add the HAshMap
            map.put(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums={15,2,7,11};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}

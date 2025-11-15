import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/
public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,6,1,5};
        System.out.println(containsDuplicate(nums));
    }
}

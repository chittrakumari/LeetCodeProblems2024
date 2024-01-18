/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

*/
public class Problem_485_MaxConsecutiveOnes {
    int k=0;
        int max=0;
        public int findMaxConsecutiveOnes(int[] nums) {
            for(int i=0;i<nums.length;i++){
                //if(i!=nums.length-1 && nums[i] )
                if(nums[i]==1){
                    k=k+1;
                    if(k>max)
                        max=k;
                }
                else{
                    if(k>max)
                        max=k;
                    k=0;
                }
            }
            return max;
        }

}

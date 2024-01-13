public class Problem_1464_MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
            int max=Integer.MIN_VALUE;
            int s_max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=s_max && nums[i]<=max){
                    s_max=nums[i];
                }
                else if(nums[i]>=max){
                    s_max=max;
                }
                if(nums[i]>max){
                    max=nums[i];
                }

            }
            return (max-1)*(s_max-1);
        }
    }


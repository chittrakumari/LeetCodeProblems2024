public class Prob_26_RemoveDuplicatesFromSortedArray {
        public static int removeDuplicates(int[] nums) {
            if(nums.length==1)
                return nums.length;
            else{
                int i=0;
                int j=1;

                while(j<nums.length){
                    if(nums[i]==nums[j]){
                        while(i<nums.length && j<nums.length && nums[j]==nums[i]){
                            j++;
                        }
                        if(i+1<nums.length  && j<nums.length){
                            i=i+1;
                            nums[i] = nums[j];}
                    }
                    else{
                        j++;
                        i++;
                    }

                }
                return i+1;
            }
        }


    public static void main(String[] args) {
       int ans = removeDuplicates (new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(ans);
    }
    }


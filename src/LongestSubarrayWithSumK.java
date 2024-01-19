import java.util.HashMap;

/*Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.

Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.

If there is no subarray whose sum is ‘K’ then you should return 0.

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]

Output: 4

There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.**/
public class LongestSubarrayWithSumK {
    public static int getLongestSubarray(int []nums, int k) {
        // Write your code here.
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            if(sum==k)
            {
                max=Integer.max(max,i+1);
            }
            int rem=sum-k;
            if(hp.containsKey(rem))
                max=Integer.max(max,i-hp.get(rem));
            if(!hp.containsKey(sum)){
                hp.put(sum,i);
            }
        }
        return max;

    }
}

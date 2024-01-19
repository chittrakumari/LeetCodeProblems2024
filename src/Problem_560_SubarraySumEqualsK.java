public class Problem_560_SubarraySumEqualsK {
    public static int subarraySum(int[] arr, int k) {
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){

                if(arr[j]+sum==k){
                    sum=sum+arr[j];
                    ans=ans+1;
                }
                else if(arr[j]+sum<k){
                    sum=sum+arr[j];
                }

            }
        }
        return ans;
    }
    public static void main(String[] args){
        int ans= subarraySum(new int[]{1, -1, 0}, 3);
        System.out.println(ans);
    }
}

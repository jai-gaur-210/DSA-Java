
class MaxSubArray
{  
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i< nums.length ; i++){
            currsum += nums[i];
            if(currsum > maxsum) {
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main (String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray a = new MaxSubArray();
        int ans = a.maxSubArray(arr);
        System.out.println(ans);   
    }     
}
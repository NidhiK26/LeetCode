class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                maxcount++;
               
            }
            else{
                ans=Math.max(ans,maxcount);
                maxcount=0;
            }
        }
        ans=Math.max(ans, maxcount);
            return ans;
    }
}